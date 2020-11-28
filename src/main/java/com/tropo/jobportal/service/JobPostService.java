package com.tropo.jobportal.service;

import com.tropo.jobportal.bean.JobPost;
import com.tropo.jobportal.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobPostService {
    @Autowired
    JobPostRepository jobPostRepository;

    public List<JobPost> getAllJobs()
    {
        List<JobPost> jobPosts = new ArrayList<JobPost>();
        jobPostRepository.findAll().forEach(jobPost -> jobPosts.add(jobPost));
        return jobPosts;
    }
    //getting a specific record
    public JobPost getJobPostById(Long id)
    {
        return jobPostRepository.findById(id).get();
    }
    public void saveOrUpdate(JobPost jobPost)
    {
        jobPostRepository.save(jobPost);
    }
    //deleting a specific record
    public void delete(Long id)
    {
        jobPostRepository.deleteById(id);
    }

}
