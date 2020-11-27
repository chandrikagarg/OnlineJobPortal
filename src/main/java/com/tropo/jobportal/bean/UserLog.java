package com.tropo.jobportal.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;
@Entity
@Table
public class UserLog {
    @Id
    @Column
    int userAccountId;
    @Column
    Date lastLogindate;

    public int getUserAccountId() {
        return userAccountId;
    }

    public void setUserAccountId(int userAccountId) {
        this.userAccountId = userAccountId;
    }

    public Date getLastLogindate() {
        return lastLogindate;
    }

    public void setLastLogindate(Date lastLogindate) {
        this.lastLogindate = lastLogindate;
    }
}
