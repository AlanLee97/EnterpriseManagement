package com.zdxh.controller;


import com.zdxh.entity.TClass;
import com.zdxh.service.TClassService;
import com.zdxh.service.TProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TCustomerController {
    @Autowired
    TClassService classService;

    @GetMapping("/CusAddProduct")
    public ModelAndView CusAddProduct() {
        //System.out.println("123");
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/home/CusAddProduct");
        List<TClass> classList = classService.getAllClasses();
        mv.addObject("classList", classList);
        return mv;
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