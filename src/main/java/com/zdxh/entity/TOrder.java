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
