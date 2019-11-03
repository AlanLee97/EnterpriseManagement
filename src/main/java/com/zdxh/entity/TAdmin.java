package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class TAdmin {
    @Setter @Getter
    private int id;
    @Setter @Getter
    private String adminUsername;
    @Setter @Getter
    private String adminPassword;
    @Setter @Getter
    private String adminName;
    @Setter @Getter
    private int adminAge;
    @Setter @Getter
    private String adminSex;
    @Setter @Getter
    private String adminPhone;

    public TAdmin() {
    }

    @Override
    public String toString() {
        return "TAdmin{" +
                "id=" + id +
                ", adminUsername='" + adminUsername + '\'' +
                ", adminPassword='" + adminPassword + '\'' +
                ", adminName='" + adminName + '\'' +
                ", adminAge=" + adminAge +
                ", adminSex='" + adminSex + '\'' +
                ", adminPhone='" + adminPhone + '\'' +
                '}';
    }
}
