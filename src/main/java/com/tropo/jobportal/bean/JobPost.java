package com.tropo.jobportal;

import java.util.Date;

public class JobPost {
    Long id;
    char isCompanyNameHidden;
    Date createdDate;
    String jobDescription;
    char isActive;

    public JobPost(Long id, char isCompanyNameHidden, Date createdDate, String jobDescription, char isActive) {
        this.id = id;
        this.isCompanyNameHidden = isCompanyNameHidden;
        this.createdDate = createdDate;
        this.jobDescription = jobDescription;
        this.isActive = isActive;
    }



    public JobPost() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public char getIsCompanyNameHidden() {
        return isCompanyNameHidden;
    }

    public void setIsCompanyNameHidden(char isCompanyNameHidden) {
        this.isCompanyNameHidden = isCompanyNameHidden;
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

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }
}
