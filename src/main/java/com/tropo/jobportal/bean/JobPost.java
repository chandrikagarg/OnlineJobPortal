package com.tropo.jobportal.bean;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table
public class JobPost {
    @Id
    @Column
    Long id;
    @Column
    Integer postedById;
    @Column
    Integer jobTypeId;
    @Column
    int companyId;
    @Column
    Boolean isCompanyNameHidden;
    @Column
    Date createdDate;
    @Column
    String jobDescription;
    @Column
    int jobLocationId;
    @Column
    Boolean isActive;

    @ManyToOne
    private JobType jobType;

    @ManyToOne
    private JobLocation jobLocation;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPostedById() {
        return postedById;
    }

    public void setPostedById(Integer postedById) {
        this.postedById = postedById;
    }

    public Integer getJobTypeId() {
        return jobTypeId;
    }

    public void setJobTypeId(Integer jobTypeId) {
        this.jobTypeId = jobTypeId;
    }

    public int getCompanyId() {
        return companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getJobLocationId() {
        return jobLocationId;
    }

    public void setJobLocationId(int jobLocationId) {
        this.jobLocationId = jobLocationId;
    }

    public Boolean getCompanyNameHidden() {
        return isCompanyNameHidden;
    }

    public void setCompanyNameHidden(Boolean companyNameHidden) {
        isCompanyNameHidden = companyNameHidden;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }

    public JobLocation getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(JobLocation jobLocation) {
        this.jobLocation = jobLocation;
    }
}
