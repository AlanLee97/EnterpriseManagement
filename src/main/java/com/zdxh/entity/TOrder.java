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
    private Date orderTime;
    @Setter @Getter
    private String orderState;
    @Setter @Getter
    private Date payTime;
    @Setter @Getter
    private int userId;
    @Setter @Getter
    private int customerId;

    /*public TOrder() { }*/
    //new
    public TOrder(int id, String orderNum, Date orderTime, String orderState, Date payTime, int userId, int customerId) {
        this.id = id;
        this.orderNum = orderNum;
        this.orderTime = orderTime;
        this.orderState = orderState;
        this.payTime = payTime;
        this.userId = userId;
        this.customerId = customerId;
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
