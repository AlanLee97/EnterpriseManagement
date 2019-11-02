package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

public class TProduct {
    @Setter @Getter
    private int id;
    @Setter @Getter
    private int productNum;
    @Setter @Getter
    private int productName;

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
    private int productIntroduce;

    @Setter @Getter
    private int productDate;


    public TProduct() {
    }

    public TProduct(int productNum, int productName, double productPrice, String productImg, int productNumber, int classId, int customerId, int productIntroduce, int productDate) {
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
                ", productNum=" + productNum +
                ", productName=" + productName +
                '}';
    }
}
