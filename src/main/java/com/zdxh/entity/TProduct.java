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
    private Date productDate;


    public TProduct() {}
    //new
    public TProduct(int id, String productNum, String productName, double productPrice, String productImg, int productNumber, int classId, int customerId, String productIntroduce, Date productDate) {
        this.id = id;
        this.productNum = productNum;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productImg = productImg;
        this.productNumber = productNumber;
        this.classId = classId;
        this.customerId = customerId;
        this.productIntroduce = productIntroduce;
        this.productDate = productDate;
    }

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
