package com.zdxh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Ljw
 * @create 2019 10 27 下午 10:52
 */

@RestController
public class ClientManageController {
    @RequestMapping("/viewClientManager")
    public ModelAndView viewClientManager() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/viewClientManager");
        return mv;
    }

    /**
     * 页面：资金管理
     *
     * @return
     */
    @RequestMapping("/CapitalManager")
    public ModelAndView CapitalManager() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("OrderManager");
        return mv;
    }

    /**
     * 页面：公司介绍
     *
     * @return
     */
    @RequestMapping("/GongSiJieShao")
    public ModelAndView GongSiJieShao() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/GongSiJieShao");
        return mv;
    }

    /**
     * 页面：订单管理
     *
     * @return
     */
    @RequestMapping("/OrderManager")
    public ModelAndView OrderManager() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/OrderManager");
        return mv;
    }
    /**
     * 页面：用户信息管理
     *
     * @return
     */
    @RequestMapping("/userManagement")
    public ModelAndView userManagement() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/userManagement");
        return mv;
    }
    @RequestMapping("/AddGoods")
    public ModelAndView AddGoods() {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/AddGoods");
        return mv;
    }
}

