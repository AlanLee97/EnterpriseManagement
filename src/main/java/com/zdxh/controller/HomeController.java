package com.zdxh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public ModelAndView index2(){
        return new ModelAndView("/home/index");
    }

    @RequestMapping("/home/register")
    public ModelAndView register(){
        return new ModelAndView("/home/register");
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

}
