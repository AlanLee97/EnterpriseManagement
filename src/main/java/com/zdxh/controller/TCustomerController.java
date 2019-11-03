package com.zdxh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TCustomerController {
    @GetMapping("/CusAddProduct")
    public String CusAddProduct() {
        //System.out.println("123");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/CusAddProduct");
        return "./home/CusAddProduct";
    }
    @GetMapping("/dingdanzhongxin")
    public  String dingdanzhongxin() {
        System.out.println("123");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/dingdanzhongxin");
        return "./home/dingdanzhongxin";
    }
    @GetMapping("/wodedingdan")
    public  String wodedingdan() {
        System.out.println("123");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/wodedingdan");
        return "./home/wodedingdan";
    }
    @GetMapping("/self_info")
    public  String self_info() {
        System.out.println("123");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/self_info");
        return "./home/self_info";
    }
    @GetMapping("/upload")
    public  String upload() {
        System.out.println("123");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/upload");
        return "./static/upload";
    }
}