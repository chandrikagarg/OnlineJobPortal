package com.tropo.jobportal.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class Company {
    @Id
    @Column
    Long id;
    @Column
    String companyname;
    @Column
    String companyDescription;
    @Column
    Date establishmentDate;
    @Column
    String companyWebsiteUrl;

    @OneToMany(targetEntity=JobPost.class )
    private List jobPost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getCompanyDescription() {
        return companyDescription;
    }

    public void setCompanyDescription(String companyDescription) {
        this.companyDescription = companyDescription;
    }

    public Date getEstablishmentDate() {
        return establishmentDate;
    }

    public void setEstablishmentDate(Date establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    public String getCompanyWebsiteUrl() {
        return companyWebsiteUrl;
    }

    public void setCompanyWebsiteUrl(String companyWebsiteUrl) {
        this.companyWebsiteUrl = companyWebsiteUrl;
    }

    public List getJobPost() {
        return jobPost;
    }

    public void setJobPost(List jobPost) {
        this.jobPost = jobPost;
    }
}
