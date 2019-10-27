package com.zdxh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import sun.applet.resources.MsgAppletViewer;

import java.util.Scanner;

@RestController
public class RobotController {

    @RequestMapping(value = "/reply", method = RequestMethod.GET)
    public ModelAndView viewReply(){
        return new ModelAndView("/reply");
    }


    @RequestMapping("/replyDo")
    public void reply(String content){
        switch (content){
            case "你好":
                System.out.println("我很好");
                break;

            case "在吗":
                System.out.println("在");
                break;
                default:
                    System.out.println("a，您说什么？我没听清！");
                    break;
        }

    }
}
