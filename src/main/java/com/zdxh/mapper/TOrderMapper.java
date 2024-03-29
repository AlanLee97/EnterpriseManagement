package com.zdxh.mapper;

import com.zdxh.entity.TOrder;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TOrderMapper {
    //增：添加订单
    int addOrder(TOrder order);
    //删：删除订单
    int deleteOrderById(Integer id);
    //改：更新订单
    int updateOrder(TOrder order);
    //查：通过id获取订单
    TOrder getOrderById(Integer id);

    //查：获取所有订单
    List<TOrder> getAllOrders();

    //查：获取所有订单
    List<TOrder> getOrderByUid(Integer uid);
}
