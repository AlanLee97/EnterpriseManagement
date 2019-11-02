package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class TCustomer {
    @Setter @Getter
    private int id;

    @Setter @Getter
    private String custUsername;

    @Setter @Getter
    private String custPassword;

    @Setter @Getter
    private String custBuName;

    @Setter @Getter
    private String custBuAddress;

    @Setter @Getter
    private String custBuContactor;

    @Setter @Getter
    private String custBuIntroduction;

    @Setter @Getter
    private String custBuPhone;

    @Setter @Getter
    private String custBuEmail;

    public TCustomer() {
    }

    public TCustomer(String custUsername, String custPassword) {
        this.custUsername = custUsername;
        this.custPassword = custPassword;
    }

    public TCustomer(int id, String custUsername, String custPassword, String custBuName, String custBuAddress, String custBuContactor, String custBuIntroduction, String custBuPhone, String custBuEmail) {
        this.id = id;
        this.custUsername = custUsername;
        this.custPassword = custPassword;
        this.custBuName = custBuName;
        this.custBuAddress = custBuAddress;
        this.custBuIntroduction = custBuIntroduction;
        this.custBuPhone = custBuPhone;
        this.custBuEmail = custBuEmail;
        this.custBuContactor = custBuContactor;
    }

    @Override
    public String toString() {
        return "TCustomer{" +
                "id=" + id +
                ", custUsername='" + custUsername + '\'' +
                ", custPassword='" + custPassword + '\'' +
                ", custBuName='" + custBuName + '\'' +
                ", custBuAddress='" + custBuAddress + '\'' +
                ", custBuIntroduction='" + custBuIntroduction + '\'' +
                ", custBuPhone='" + custBuPhone + '\'' +
                ", custBuEmail='" + custBuEmail + '\'' +
                '}';
    }
}
