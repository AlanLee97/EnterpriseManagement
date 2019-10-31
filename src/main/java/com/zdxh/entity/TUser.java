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
    private String userBuAddress;

    @Setter @Getter
    private String userBuPhone;

    @Setter @Getter
    private String userEmail;

    public TUser(String userUsername, String usePassword, String userBuName, String userBuAddress, String userBuPhone, String userEmail) {
        this.userUsername = userUsername;
        this.userPassword = usePassword;
        this.userBuName = userBuName;
        this.userBuAddress = userBuAddress;
        this.userBuPhone = userBuPhone;
        this.userEmail = userEmail;
    }

    public TUser() {
    }

    public TUser(String userUsername, String usePassword) {
        this.userUsername = userUsername;
        this.userPassword = usePassword;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", userUsername='" + userUsername + '\'' +
                ", usePassword='" + userPassword + '\'' +
                ", userBuName='" + userBuName + '\'' +
                ", userBuAddress='" + userBuAddress + '\'' +
                ", userBuPhone='" + userBuPhone + '\'' +
                ", userEmail='" + userEmail + '\'' +
                '}';
    }
}
