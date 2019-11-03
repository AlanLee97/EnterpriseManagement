package com.zdxh.controller;

import com.zdxh.entity.Api;
import com.zdxh.entity.TProduct;
import com.zdxh.service.TProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class TProductController {
    @Autowired
    TProductService productService;

    @RequestMapping("/addProductDoApi")
    @ResponseBody
    public Api addProduct(String productName,
                          Double productPrice,
                          String productNum,
                          Integer productNumber,
                          String productIntroduce
//                          Date productDate
    ){

        TProduct product = new TProduct();

        product.setProductName(productName);
        product.setProductPrice(productPrice);
        product.setProductNum(productNum);
//        product.setProductImg(productimg);
        product.setProductNumber(productNumber);
        product.setProductIntroduce(productIntroduce);
//        product.setProductDate(productDate);


        int i = productService.addProduct(product);

        if (i == 1){
            return new Api(200, "ok", product);
        }else {
            return new Api(400, "error", null);
        }

    }
}
