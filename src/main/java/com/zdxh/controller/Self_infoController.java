package com.zdxh.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ljw
 * @create 2019 11 03 上午 10:40
 */
public class Self_infoController {
    @RequestMapping("/CusAddProduct")
    public ModelAndView CusAddProduct() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/CusAddProduct");
        return mv;
    }
    @RequestMapping("/wodedingdan")
    public ModelAndView wodedingdan() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/wodedingdan");
        return mv;
    }
    @RequestMapping("/upload")
    public ModelAndView upload() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/upload");
        return mv;
    }
    @RequestMapping("/self_info")
    public ModelAndView self_info() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/self_info");
        return mv;
    }
}
