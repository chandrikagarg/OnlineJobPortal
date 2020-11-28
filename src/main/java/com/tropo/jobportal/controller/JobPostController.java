package com.tropo.jobportal.controller;
import com.tropo.jobportal.bean.JobPost;
import com.tropo.jobportal.service.JobPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/testing")
public class JobPostController {

    @Autowired
    JobPostService jobPostService;
    //creating a get mapping that retrieves all the jobs detail from the database
    @GetMapping("/jobPosts")
    private List<JobPost> getAllPosts()
    {
        return jobPostService.getAllJobs();
    }
    //creating a get mapping that retrieves the detail of a specific Job
    @GetMapping("/job/{id}")
    private JobPost getJob(@PathVariable("id") Long id)
    {
        return jobPostService.getJobPostById(id);
    }
    //creating a delete mapping that deletes a specific job
    @DeleteMapping("/job/{id}")
    private void deleteJob(@PathVariable("id") Long id)
    {
        jobPostService.delete(id);
    }
    //creating post mapping that post the job detail in the database
    @PostMapping("/job")
    private Long saveJob(@RequestBody JobPost jobPost)
    {
        jobPostService.saveOrUpdate(jobPost);
        return jobPost.getId();
    }

    @RequestMapping("/")
    String get(){
        return "Hello from get";
    }
}
