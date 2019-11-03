package com.zdxh.controller;

import com.zdxh.entity.ChatData;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@RestController
public class RobotController {

    @RequestMapping(value = "/reply")
    public ModelAndView viewReply(){
        return new ModelAndView("/reply");
    }


    @RequestMapping(value = "/home/index", method = RequestMethod.POST)
    @ResponseBody
    public ChatData reply(String textcontent){
        //ModelAndView mv = new ModelAndView("/reply");
        ChatData chatData = null;
        switch (textcontent){
            case "请问我的快递什么时候到？":
                System.out.println("下单两到三天内，卖家会进行发货，最多五天即可到达您的手中");
                //mv.addObject("first", "我很好");
                chatData = new ChatData(200, "ok", new ChatData.Data("下单两到三天内，卖家会进行发货，最多五天即可到达您的手中"));
                break;
            case "在吗":
                System.out.println("在的呢，亲");
                //mv.addObject("second", "在");
                chatData = new ChatData(200, "ok", new ChatData.Data("在的呢，亲"));
                break;
            case "官方售后服务电话多少？":
                System.out.println("戴尔全国售后电话：400-886-8611</br>" +
                        "英菲克全国售后电话：400-018-7128</br>" +
                        "金百达全国售后电话：0755-28230252</br>");
                //mv.addObject("second", "在");
                chatData = new ChatData(200, "ok", new ChatData.Data("戴尔全国售后电话：400-886-8611</br>" +
                        "英菲克全国售后电话：400-018-7128</br>" + "金百达全国售后电话：0755-28230252</br>"
                        ));
                break;
            case "如何退货？":
                System.out.println("亲亲，已经发货了，您申请7天无理由退货就可以了，选退货退款</br>" + "然后快递通知您的时候您拒签就可以了");
                //mv.addObject("second", "在");
                chatData = new ChatData(200, "ok", new ChatData.Data("亲亲，已经发货了，您申请7天无理由退货就可以了，选退货退款<br>" +
                        "然后快递通知您的时候您拒签就可以了"));
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
