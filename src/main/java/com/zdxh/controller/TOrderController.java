package com.zdxh.controller;

import com.zdxh.entity.Api;
import com.zdxh.entity.TOrder;
import com.zdxh.entity.TProduct;
import com.zdxh.service.TOrderService;
import com.zdxh.service.TProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class TOrderController {
    @Autowired
    TProductService productService;

    @Autowired
    TOrderService orderService;

    @RequestMapping("/home/create-order")
    public ModelAndView createOrder(Integer pid){

        ModelAndView mv = new ModelAndView("/home/create-order");
        TProduct product = productService.getProductById(pid);
        mv.addObject("product", product);

        return mv;

    }

    @RequestMapping("/home/createOrderDoApi")
    @ResponseBody
    public Api createOrderDoApi(Integer uid, Integer cid, Integer pid){
        TOrder order = new TOrder();
        Long orderNum = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String orderTime = sdf.format(new Date());
        String payTime = sdf.format(new Date());
        String orderState = "完成";

        order.setUserId(uid);
        order.setCustomerId(cid);
        order.setProductId(pid);
        order.setOrderNum(orderNum.toString());
        order.setOrderState(orderState);
        order.setOrderTime(orderTime);
        order.setPayTime(payTime);

        System.out.println(order);

        int i = orderService.addOrder(order);
        if (i == 1){
            return new Api(200, "ok", order);
        }else {
            return new Api(400, "error", null);
        }

    }

}
