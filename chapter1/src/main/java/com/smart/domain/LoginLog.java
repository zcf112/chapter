package com.smart.domain;

import java.io.Serializable;
import java.util.Date;

public class LoginLog implements Serializable {
    private int loginLogId;
    private int userId;
    private String ip;
    private Date loginDate;

    public int getUserId() {
        return this.userId;
    }

    public String getIp() {
        return this.ip;
    }

    public Date getLoginDate() {
        return this.loginDate;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setIp(String lastIp) {
        this.ip =lastIp;
    }

    public void setLoginDate(Date lastVisit) {
        this.loginDate = lastVisit;
    }
}
