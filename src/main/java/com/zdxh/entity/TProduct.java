package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class TProduct {
    @Setter @Getter
    private int id;
    @Setter @Getter
    private String productNum;
    @Setter @Getter
    private String productName;

    @Setter @Getter
    private double productPrice;

    @Setter @Getter
    private String productImg;

    @Setter @Getter
    private int productNumber;

    @Setter @Getter
    private int classId;

    @Setter @Getter
    private int customerId;

    @Setter @Getter
    private String productIntroduce;

    @Setter @Getter
    private String productDate;


    public TProduct() {}
    //new


    @Override
    public String toString() {
        return "TProduct{" +
                "id=" + id +
                ", productNum='" + productNum + '\'' +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productImg='" + productImg + '\'' +
                ", productNumber=" + productNumber +
                ", classId=" + classId +
                ", customerId=" + customerId +
                ", productIntroduce='" + productIntroduce + '\'' +
                ", productDate=" + productDate +
                '}';
    }
}
