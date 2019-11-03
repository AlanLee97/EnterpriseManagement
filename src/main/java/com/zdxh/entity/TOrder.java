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
