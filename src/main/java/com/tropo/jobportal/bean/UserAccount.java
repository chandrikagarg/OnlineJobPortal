package com.tropo.jobportal.bean;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table
public class UserAccount {
    @Id
    @Column
    Long id;
    @Column(unique=true)
    String email;
    @Column
    String password; // todo password should be encrypted, should not be stored in plain text
    @Column
    Date dateOfBirth;
    @Column
    char gender;
    @Column
    char isActive;
    @Column
    String contactNumber;
    @Column
    Date registrationdate;

    @OneToMany( targetEntity=UserLog.class )
    private List userLog;

    @OneToMany( targetEntity=JobPost.class )
    private List jobPost;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public char getIsActive() {
        return isActive;
    }

    public void setIsActive(char isActive) {
        this.isActive = isActive;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public Date getRegistrationdate() {
        return registrationdate;
    }

    public void setRegistrationdate(Date registrationdate) {
        this.registrationdate = registrationdate;
    }

    public List getUserLog() {
        return userLog;
    }

    public void setUserLog(List userLog) {
        this.userLog = userLog;
    }

    public List getJobPost() {
        return jobPost;
    }

    public void setJobPost(List jobPost) {
        this.jobPost = jobPost;
    }
}
