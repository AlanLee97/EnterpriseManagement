package com.zdxh.controller;

import com.zdxh.entity.TProduct;
import com.zdxh.service.TProductService;
import com.zdxh.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class HomeController {
    /** --------------------------- 属性：开始--------------------------- **/
    @Autowired
    TUserService userService;

    @Autowired
    TProductService productService;


    /** =========================== 属性：结束 ============================== **/


    /** --------------------------- 返回的页面：开始--------------------------- **/
    @RequestMapping("/home")
    public ModelAndView index2(){
        ModelAndView mv = new ModelAndView("/home/index");
        List<TProduct> phoneList = productService.getProductByClassId(1);
        List<TProduct> laptopList = productService.getProductByClassId(2);
        List<TProduct> computerList = productService.getProductByClassId(3);
        List<TProduct> tvList = productService.getProductByClassId(4);
        List<TProduct> padList = productService.getProductByClassId(5);
        mv.addObject("phoneList",phoneList);
        mv.addObject("laptopList",laptopList);
        mv.addObject("computerList",computerList);
        mv.addObject("tvList",tvList);
        mv.addObject("padList",padList);
        return mv;
    }

    @RequestMapping("/home/register")
    public ModelAndView register_select(){
        return new ModelAndView("/home/register");
    }


    @RequestMapping("/home/register-user")
    public ModelAndView register_user(){
        return new ModelAndView("/home/register-user");
    }

    @RequestMapping("/home/register-customer")
    public ModelAndView register_customer(){
        return new ModelAndView("/home/register-customer");
    }

    @RequestMapping("/home/login")
    public ModelAndView login(){
        return new ModelAndView("/home/login");
    }

    @RequestMapping("/home/dingdanzhongxin")
    public ModelAndView dingdanzhongxin(){
        return new ModelAndView("/home/dingdanzhongxin");
    }

    @RequestMapping("/home/gouwuche")
    public ModelAndView gouwuche(){
        return new ModelAndView("/home/gouwuche");
    }

    @RequestMapping("/home/liebiao")
    public ModelAndView liebiao(){
        return new ModelAndView("/home/liebiao");
    }

    @RequestMapping("/home/self_info")
    public ModelAndView self_info(){
        return new ModelAndView("/home/self_info");
    }

    @RequestMapping("/home/xiangqing")
    public ModelAndView xiangqing(Integer pid){
        ModelAndView mv = new ModelAndView("/home/xiangqing");
        TProduct product = productService.getProductById(pid);
        mv.addObject("product", product);
        return mv;
    }

    @RequestMapping("/home/order")
    public ModelAndView order(){
        return new ModelAndView("/home/order");
    }

    @RequestMapping("/home/index-robot")
    public ModelAndView index_robot(){
        return new ModelAndView("/home/index-robot");
    }


    /** =========================== 返回的页面：结束 ============================== **/


    /** --------------------------- 处理方法：开始--------------------------- **/





    /** =========================== 处理方法：结束 ============================== **/





}
