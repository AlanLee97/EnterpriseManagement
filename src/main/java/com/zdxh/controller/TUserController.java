package com.zdxh.controller;


import com.zdxh.entity.Api;
import com.zdxh.entity.TUser;
import com.zdxh.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class TUserController {
    @Autowired
    TUserService userService;

    @RequestMapping("/testGetAllUsers")
    @ResponseBody
    public Api getAllUsers(){
//        ModelAndView mv = new ModelAndView("/admin/user-list");
        List<TUser> userList = userService.getAllUsers();
        if (userList != null && !userList.isEmpty()){
            for (TUser user : userList) {
                System.out.println(user);
            }
//            mv.addObject("userList", userList);
        }else {
            System.out.println("没有拿到数据");
        }
        return new Api(200, "ok", userList);
    }

   /* @RequestMapping("/home/order")
    @ResponseBody
    public Api getOneUser(){
//        ModelAndView mv = new ModelAndView("/home/order");
        List<TUser> oneuserList1 = (List<TUser>) userService.getOneUser(1);
        if (oneuserList1 != null && !oneuserList1.isEmpty()){
            for (TUser user : oneuserList1) {
                System.out.println(user);
            }
//            mv.addObject("userList", userList);
        }else {
            System.out.println("没有拿到数据");
        }
        return new Api(200, "ok", oneuserList1);
    }*/

    @RequestMapping("/getOneUser")
    @ResponseBody
    public ModelAndView getOneUser(Integer id){
        ModelAndView mv = new ModelAndView("personal-user");

        List<TUser> orderList1 = (List<TUser>) userService.getOneUser(1);

        mv.addObject("orderList1",orderList1 );

        return mv;
    }




}
