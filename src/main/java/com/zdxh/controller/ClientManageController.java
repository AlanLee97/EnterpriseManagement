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
    public ModelAndView viewClientManager(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/viewClientManager");
        return mv;
    }
}
