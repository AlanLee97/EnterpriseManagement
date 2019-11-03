package com.zdxh.mapper;

import com.zdxh.entity.TCustomer;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TCustomerMapper {

    //增：添加用户
    int addCustomer(TCustomer customer);
    //删：删除用户
    int deleteCustomerById(Integer id);
    //改：更新用户
    int updateCustomer(TCustomer customer);
    //查：通过id获取用户
    TCustomer getCustomerById(Integer id);
    //查：通过用户名获取用户
    TCustomer getCustomerByUsernamePassword(TCustomer customer);
    //查：获取所有用户
    List<TCustomer> getAllCustomers();

}
