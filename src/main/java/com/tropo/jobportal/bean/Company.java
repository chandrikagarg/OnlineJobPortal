package com.tropo.jobportal;

import java.util.Date;

public class Company {
    Long id;
    String companyname;
    String companyDescription;
    Date establishmentDate;
    String companyWebsiteUrl;

    public Company(Long id, String companyname, String companyDescription, Date establishmentDate, String companyWebsiteUrl) {
        this.id = id;
        this.companyname = companyname;
        this.companyDescription = companyDescription;
        this.establishmentDate = establishmentDate;
        this.companyWebsiteUrl = companyWebsiteUrl;
    }

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
}
