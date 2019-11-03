package com.zdxh.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

public class TOrder {
    @Setter @Getter
    private int id;
    @Setter @Getter
    private String orderNum;
    @Setter @Getter
    private String orderTime;
    @Setter @Getter
    private String orderState;
    @Setter @Getter
    private String payTime;
    @Setter @Getter
    private int userId;
    @Setter @Getter
    private int customerId;


    @Setter @Getter
    private int productId;

    public TOrder() {
    }

    /*public TOrder() { }*/
    //new


    public TOrder(String orderNum, String orderTime, String orderState, String payTime, int userId, int customerId, int productId) {
        this.orderNum = orderNum;
        this.orderTime = orderTime;
        this.orderState = orderState;
        this.payTime = payTime;
        this.userId = userId;
        this.customerId = customerId;
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "TOrder{" +
                "id=" + id +
                ", orderNum=" + orderNum +
                ", orderTime=" + orderTime +
                ", orderState='" + orderState + '\'' +
                ", payTime=" + payTime +
                ", userId=" + userId +
                ", customerId=" + customerId +
                '}';
    }
}
