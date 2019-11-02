package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class TRobot {
    @Setter @Getter
    private int id;
    @Setter @Getter
    private int robotNum;

    public TRobot() {
    }

    public TRobot(int robotNum) {
        this.robotNum = robotNum;
    }

    @Override
    public String toString() {
        return "TRobot{" +
                "id=" + id +
                ", robotNum=" + robotNum +
                '}';
    }
}
