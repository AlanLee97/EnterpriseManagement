package com.zdxh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class IndexController {

    @RequestMapping("/")
    public ModelAndView index(){
        ModelAndView mv = new ModelAndView("/index");
        return mv;
    }
    @RequestMapping("/custoSerivce")
    public ModelAndView custoService(){
        ModelAndView mv = new ModelAndView("/custoSerivce");
        return mv;
    }
}
