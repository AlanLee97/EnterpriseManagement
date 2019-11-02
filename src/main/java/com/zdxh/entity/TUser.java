package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class TUser {
    @Setter @Getter
    private int id;

    @Setter @Getter
    private String userUsername;

    @Setter @Getter
    private String userPassword;

    @Setter @Getter
    private String userBuName;

    @Setter @Getter
    private String custBuContactor;

    @Setter @Getter
    private String userBuAddress;


    @Setter @Getter
    private String userBuPhone;

    @Setter @Getter
    private String userEmail;



    public TUser() {
    }

    public TUser(String userUsername, String usePassword) {
        this.userUsername = userUsername;
        this.userPassword = usePassword;
    }

    public TUser(int id, String userUsername, String userPassword, String userBuName, String custBuContactor, String userBuAddress, String userBuPhone, String userEmail) {
        this.id = id;
        this.userUsername = userUsername;
        this.userPassword = userPassword;
        this.userBuName = userBuName;
        this.custBuContactor = custBuContactor;
        this.userBuAddress = userBuAddress;
        this.userBuPhone = userBuPhone;
        this.userEmail = userEmail;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", userUsername='" + userUsername + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userBuName='" + userBuName + '\'' +
                ", userBuAddress='" + userBuAddress + '\'' +
                ", custBuContactor='" + custBuContactor + '\'' +
                ", userBuPhone='" + userBuPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
