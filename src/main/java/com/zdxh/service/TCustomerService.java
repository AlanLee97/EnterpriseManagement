package com.zdxh.service;

import com.zdxh.entity.TCustomer;
import com.zdxh.mapper.TCustomerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TCustomerService {
    @Autowired
    TCustomerMapper customerMapper;

    //增：添加用户
    public int addCustomer(TCustomer customer){
        return customerMapper.addCustomer(customer);
    }
    //删：删除用户
    public int deleteCustomerById(Integer id){
        return customerMapper.deleteCustomerById(id);
    }
    //改：更新用户
    public int updateCustomer(TCustomer customer){
        return customerMapper.updateCustomer(customer);
    }
    //查：通过id获取用户
    public TCustomer getCustomerById(Integer id){
        return customerMapper.getCustomerById(id);
    }
    //查：获取所有用户
    public List<TCustomer> getAllCustomers(){
        return customerMapper.getAllCustomers();
    }

    public boolean getCustomerByUsernamePassword(TCustomer customer) {
        TCustomer customer1 = customerMapper.getCustomerByUsernamePassword(customer);
        return customer1 != null;
    }
}
