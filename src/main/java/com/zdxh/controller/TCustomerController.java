package com.zdxh.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TCustomerController {
    @GetMapping("/CusAddProduct")
    public String CusAddProduct() {
        System.out.println("123");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/CusAddProduct");
        return "./home/CusAddProduct";
    }

    @RequestMapping("/wodedingdan")
    public ModelAndView wodedingdan() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/wodedingdan");
        return mv;
    }
}