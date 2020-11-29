package com.tropo.jobportal.bean;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class JobPost {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @Column
    Integer postedById;
    @Column
    Integer jobTypeId;
    @Column
    int companyId;
    @Column
    Character isCompanyNameHidden;
    @Column
    Date createdDate;
    @Column
    String jobDescription;

    @Column
    Long jobLocationId;
    @Column
    Character isActive;


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

    public Long getJobLocationId() {
        return jobLocationId;
    }

    public void setJobLocationId(Long jobLocationId) {
        this.jobLocationId = jobLocationId;
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

    public Character getIsCompanyNameHidden() {
        return isCompanyNameHidden;
    }

    public void setIsCompanyNameHidden(Character isCompanyNameHidden) {
        this.isCompanyNameHidden = isCompanyNameHidden;
    }

    public Character getIsActive() {
        return isActive;
    }

    public void setIsActive(Character isActive) {
        this.isActive = isActive;
    }
}
