package com.zdxh.controller;

import com.zdxh.entity.TClass;
import com.zdxh.entity.TCustomer;
import com.zdxh.entity.TProduct;
import com.zdxh.entity.TUser;
import com.zdxh.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * 后台管理
 */
@Controller
public class AdminController {
    @Autowired
    TUserService userService;

    @Autowired
    TCustomerService customerService;

    @Autowired
    TProductService productService;

    @Autowired
    TClassService classService;

    @Autowired
    TOrderService orderService;

    /**
     * 后台管理首页
     * @return
     */
    @RequestMapping("/admin")
    public ModelAndView admin(){
        return new ModelAndView("/admin/index");
    }

    /**
     * 后台管理首页
     * @return
     */
    @RequestMapping("/admin/index")
    public ModelAndView adminIndex(){
        return new ModelAndView("/admin/index");
    }

    /**
     * 用户管理-查询所有用户
     * @return
     */
    @GetMapping("/admin/user-list")
    public ModelAndView viewUserManager(){
        ModelAndView mv = new ModelAndView("/admin/user-list");
        List<TUser> userList = userService.getAllUsers();
        if (userList != null && !userList.isEmpty()){
            for (TUser user : userList) {
                System.out.println(user);
            }
            mv.addObject("userList", userList);
        }else {
            System.out.println("没有拿到数据");
        }
        return mv;
    }

    /**
     * 客户管理-查询所有客户
     * @return
     */
    @RequestMapping("/admin/customer-list")
    public ModelAndView viewCustomerManager(){
        ModelAndView mv = new ModelAndView("/admin/customer-list");
        List<TCustomer> customerList = customerService.getAllCustomers();
        if (customerList != null && !customerList.isEmpty()){
            for (TCustomer customer : customerList) {
                System.out.println(customer);
            }
            mv.addObject("customerList", customerList);
        }else {
            System.out.println("没有拿到数据");
        }
        return mv;
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
    @RequestMapping("/admin/product-list")
    public ModelAndView viewGoodsManager(){
        ModelAndView mv = new ModelAndView("/admin/product-list");
        List<TProduct> productList = productService.getAllProducts();
        mv.addObject("productList", productList);
        return mv;
    }

    /**
     * 商品管理-添加商品
     * @return
     */
    @RequestMapping("/admin/add-product")
    public ModelAndView viewAddGoods(){
        return new ModelAndView("/admin/add-product");
    }

    /**
     * 商品管理-查询所有分类
     * @return
     */
    @RequestMapping("/admin/class-list")
    public ModelAndView viewClassManagement(){
        ModelAndView mv = new ModelAndView("/admin/class-list");
        List<TClass> classList = classService.getAllClasses();
        mv.addObject("classList", classList);
        return mv;
    }

    /**
     * 商品管理-添加分类
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
    @RequestMapping("admin/left-menu")
    public ModelAndView viewLeftMenu(){
        return new ModelAndView("/admin/left-menu");
    }
}
