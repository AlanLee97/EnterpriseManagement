package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Setter
    @Getter
    private int id;

    @Setter
    @Getter
    private String username;

    @Setter
    @Getter
    private String password;

    public User() {
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
