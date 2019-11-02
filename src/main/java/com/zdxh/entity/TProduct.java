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

    public TProduct() {
    }

    public TProduct(int productNum, int productName) {
        this.productNum = productNum;
        this.productName = productName;
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
