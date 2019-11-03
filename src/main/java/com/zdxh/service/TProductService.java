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

    //增：添加商品
    public int addProduct(TProduct product){
        return productMapper.addProduct(product);
    }
    //删：删除商品
    public int deleteProductById(Integer id){
        return productMapper.deleteProductById(id);
    }
    //改：更新商品
    public int updateProduct(TProduct product){
        return productMapper.updateProduct(product);
    }
    //查：通过id获取商品
    public TProduct getProductById(Integer id){
        return productMapper.getProductById(id);
    }
    //查：获取所有商品
    public List<TProduct> getAllProducts(){
        return productMapper.getAllProducts();
    }


    //查：根据分类id获取商品
    public List<TProduct> getProductByClassId(Integer classId){
        return productMapper.getProductByClassId(classId);
    }


}
