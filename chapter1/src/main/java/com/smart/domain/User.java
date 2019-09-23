package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private int userId;
    private String userName;
    private String password;
    private String lastIp;
    private Date lastVisit;

    public void setUserId(int user_id) {
        this.userId=user_id;
    }

    public void setUserName(String userName) {
        this.userName=userName;
    }

    public Date getLastVisit() {
        return this.lastVisit;
    }

    public String getLastIp() {
        return this.lastIp;
    }

    public int getUserId() {
        return this.userId;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setLastIp(String remoteAddr) {
        this.lastIp = remoteAddr;
    }

    public void setLastVisit(Date date) {
        this.lastVisit = date;
    }
}
