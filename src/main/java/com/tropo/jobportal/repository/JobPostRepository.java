package com.tropo.jobportal.repository;

import com.tropo.jobportal.bean.JobPost;
import org.springframework.data.repository.CrudRepository;

public interface JobPostRepository extends CrudRepository<JobPost, Long> {
}
