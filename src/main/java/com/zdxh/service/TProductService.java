package com.zdxh.service;

import com.zdxh.entity.TCustomer;
import com.zdxh.entity.TProduct;
import com.zdxh.mapper.TCustomerMapper;
import com.zdxh.mapper.TProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TProductService {
    @Autowired
    TProductMapper productMapper;

    //增：添加用户
    public int addProduct(TProduct product){
        return productMapper.addProduct(product);
    }
    //删：删除用户
    public int deleteProductById(Integer id){
        return productMapper.deleteProductById(id);
    }
    //改：更新用户
    public int updateCustomer(TProduct product){
        return productMapper.updateProduct(product);
    }
    //查：通过id获取用户
    public TProduct getCustomerById(Integer id){
        return productMapper.getProductById(id);
    }
    //查：获取所有用户
    public List<TProduct> getAllProducts(){
        return productMapper.getAllProducts();
    }


}
