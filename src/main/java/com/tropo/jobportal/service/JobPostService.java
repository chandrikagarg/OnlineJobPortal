package com.tropo.jobportal.service;

import com.tropo.jobportal.bean.JobPost;
import com.tropo.jobportal.exception.JobPostServiceException;
import com.tropo.jobportal.exception.ResourceNotFoundException;
import com.tropo.jobportal.repository.JobPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class JobPostService {
    @Autowired
    JobPostRepository jobPostRepository;

    public List<JobPost> getAllJobs() throws JobPostServiceException {
        List<JobPost> jobPosts = new ArrayList<JobPost>();
        try {
            jobPostRepository.findAll().forEach(jobPost -> jobPosts.add(jobPost));
        } catch(Exception e) {
            throw new JobPostServiceException("No Jobs Found ");
        }
        return jobPosts;
    }
    //getting a specific record
    public JobPost getJobPostById(Long id) throws JobPostServiceException{
        JobPost jobPost = null;
        try{
            jobPost = jobPostRepository.findById(id).get();
        } catch(Exception e) {
            throw new JobPostServiceException("Requested Job does not exist");

        }

        return jobPost;
    }
    public void saveOrUpdate(JobPost jobPost) throws JobPostServiceException {
        try {
            jobPostRepository.save(jobPost);
        } catch(Exception e){
            throw new JobPostServiceException("Error while saving the job");
        }
    }
    //deleting a specific record
    public void delete(Long id) throws JobPostServiceException {
        try {
            jobPostRepository.deleteById(id);
        } catch(Exception e) {
            throw new JobPostServiceException("Not able to delete as Job does not exist for Id: "+id);
        }
    }

}
