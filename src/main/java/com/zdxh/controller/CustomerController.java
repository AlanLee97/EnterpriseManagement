package com.zdxh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CustomerController {

    @RequestMapping("/customerManagement")
    public ModelAndView customerManagementView(){
        return new ModelAndView("/customerManagement");
    }
}
