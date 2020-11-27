package com.tropo.jobportal.controller;
import com.tropo.jobportal.bean.JobPost;
import com.tropo.jobportal.dao.JobPostDao;
import com.tropo.jobportal.exception.JobPostException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testing")
public class JobPostController {

    @Autowired
    private JobPostDao jobPostdao;

    @RequestMapping("/list/posts")
    public List<JobPost> view() throws JobPostException {
        List<JobPost> listOfJobs = jobPostdao.listOfJobPosts();
        return listOfJobs;
    }
    @PostMapping("/job")
    public int createpost(@RequestBody JobPost jobPost) {
//        return jobPostdao.addJob(jobPost);
        return 0;
    }

    @RequestMapping("/")
    String get(){
        return "Hello from get";
    }
}
