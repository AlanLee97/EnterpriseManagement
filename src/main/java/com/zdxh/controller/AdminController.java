package com.zdxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 后台管理
 */
@Controller
public class AdminController {

    /**
     * 后台管理首页
     * @return
     */
    @RequestMapping("/admin")
    public ModelAndView admin(){
        return new ModelAndView("/admin/index");
    }

    /**
     * 用户管理-查询所有用户
     * @return
     */
    @RequestMapping("/admin/user-list")
    public ModelAndView viewUserManager(){
        return new ModelAndView("/admin/user-list");
    }

    /**
     * 客户管理-查询所有客户
     * @return
     */
    @RequestMapping("/admin/customer-list")
    public ModelAndView viewCustomerManager(){
        return new ModelAndView("/admin/customer-list");
    }

    /**
     * 订单管理-查询所有订单
     * @return
     */
    @RequestMapping("/admin/order-list")
    public ModelAndView viewOrderManager(){
        return new ModelAndView("/admin/order-list");
    }

    /**
     * 商品管理-查询所有商品
     * @return
     */
    @RequestMapping("/admin/goods-list")
    public ModelAndView viewGoodsManager(){
        return new ModelAndView("/admin/goods-list");
    }

    /**
     * 商品管理-添加商品
     * @return
     */
    @RequestMapping("/admin/add-goods")
    public ModelAndView viewAddGoods(){
        return new ModelAndView("/admin/add-goods");
    }

    /**
     * 商品管理-查询所有商品
     * @return
     */
    @RequestMapping("/admin/class-list")
    public ModelAndView viewClassManagement(){
        return new ModelAndView("/admin/class-list");
    }

    /**
     * 商品管理-添加商品
     * @return
     */
    @RequestMapping("/admin/add-class")
    public ModelAndView viewAddClass(){
        return new ModelAndView("/admin/add-class");
    }


    /**
     * 左侧菜单栏
     * @return
     */
    @RequestMapping("/admin/left-menu")
    public ModelAndView viewLeftMenu(){
        return new ModelAndView("/admin/left-menu");
    }
}
