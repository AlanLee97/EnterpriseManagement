package com.zdxh.controller;

import com.zdxh.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    /** --------------------------- 属性：开始--------------------------- **/
    @Autowired
    TUserService userService;

    /** =========================== 属性：结束 ============================== **/


    /** --------------------------- 返回的页面：开始--------------------------- **/
    @RequestMapping("/home")
    public ModelAndView index2(){
        return new ModelAndView("/home/index");
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
    public ModelAndView xiangqing(){
        return new ModelAndView("/home/xiangqing");
    }



    /** =========================== 返回的页面：结束 ============================== **/


    /** --------------------------- 处理方法：开始--------------------------- **/





    /** =========================== 处理方法：结束 ============================== **/





}
