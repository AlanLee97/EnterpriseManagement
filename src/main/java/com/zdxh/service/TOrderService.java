package com.zdxh.service;

import com.zdxh.entity.TCustomer;
import com.zdxh.entity.TOrder;
import com.zdxh.mapper.TOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TOrderService {
    @Autowired
    TOrderMapper orderMapper;

    //增：添加用户
    public int addOrder(TOrder order){
        return orderMapper.addOrder(order);
    }
    //删：删除用户
    public int deleteOrderById(Integer id){
        return orderMapper.deleteOrderById(id);
    }
    //改：更新用户
    public int updateOrder(TOrder order){
        return orderMapper.updateOrder(order);
    }
    //查：通过id获取用户
    public TOrder getOrderById(Integer id){
        return orderMapper.getOrderById(id);
    }
    //查：获取所有用户
    public List<TOrder> getAllOrders(){
        return orderMapper.getAllOrders();
    }


}
