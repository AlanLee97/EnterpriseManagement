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
}
