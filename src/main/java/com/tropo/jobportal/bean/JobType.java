package com.tropo.jobportal.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class JobType {
    @Id
    @Column
    int id;
    @Column
    String jobType;

    @OneToMany(targetEntity=JobPost.class )
    private List jobPost;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getJobType() {
        return jobType;
    }

    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
}
