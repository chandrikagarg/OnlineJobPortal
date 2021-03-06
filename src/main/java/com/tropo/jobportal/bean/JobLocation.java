package com.tropo.jobportal.bean;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class JobLocation {
    @Id
    @Column
    Long id;
    @Column
    String streetAdress;
    @Column
    String city;
    @Column
    String state;
    @Column
    String country;
    @Column
    String zip;

    @OneToMany(targetEntity=JobPost.class )
    private List jobPost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStreetAdress() {
        return streetAdress;
    }

    public void setStreetAdress(String streetAdress) {
        this.streetAdress = streetAdress;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
