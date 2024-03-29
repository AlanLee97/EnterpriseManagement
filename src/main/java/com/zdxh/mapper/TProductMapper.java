package com.zdxh.mapper;

import com.zdxh.entity.TClass;
import com.zdxh.entity.TProduct;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TProductMapper {

    //增：添加商品
    int addProduct(TProduct product);
    //删：删除商品
    int deleteProductById(Integer id);
    //改：更新商品
    int updateProduct(TProduct product);
    //查：通过id获取商品
    TProduct getProductById(Integer id);
    
    //查：获取所有商品
    List<TProduct> getAllProducts();

    //查：根据分类id获取商品
    List<TProduct> getProductByClassId(Integer classId);

}
