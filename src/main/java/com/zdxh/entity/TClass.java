package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class TClass {
    @Setter @Getter
    private int id;
    @Setter @Getter
    private int classNum;
    @Setter @Getter
    private String className;

    public TClass() {
    }

    @Override
    public String toString() {
        return "TClass{" +
                "id=" + id +
                ", classNum=" + classNum +
                ", className='" + className + '\'' +
                '}';
    }
}
