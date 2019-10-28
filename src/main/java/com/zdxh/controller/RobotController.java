package com.zdxh.controller;

import com.zdxh.entity.ChatData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class RobotController {

    @RequestMapping(value = "/reply")
    public ModelAndView viewReply(){
        return new ModelAndView("/reply");
    }


    @RequestMapping(value = "/replyDo", method = RequestMethod.POST)
    @ResponseBody
    public ChatData reply(String content){
        //ModelAndView mv = new ModelAndView("/reply");
        ChatData chatData = null;
        switch (content){
            case "你好":
                System.out.println("我很好");
                //mv.addObject("first", "我很好");
                chatData = new ChatData(200, "ok", new ChatData.Data("我很好"));
                break;
            case "在吗":
                System.out.println("在");
                //mv.addObject("second", "在");
                chatData = new ChatData(200, "ok", new ChatData.Data("在"));

                break;
                default:
                    System.out.println("啊，您说什么？我没听清！");
                    //mv.addObject("third", "啊，您说什么？我没听清！");
                    chatData = new ChatData(200, "ok", new ChatData.Data("啊，您说什么？我没听清！"));

                    break;
        }
        return chatData;

    }
}
