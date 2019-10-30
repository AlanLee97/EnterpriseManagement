package com.zdxh.controller;


import com.zdxh.entity.TUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class TUserController {

    /**
     * 注册处理
     * @param username 帐号
     * @param password 密码
     * @return
     */
//    @RequestMapping(value = "/registerDo", method = RequestMethod.POST)
//    public boolean register(String username, String password){
//        ModelAndView mv = new ModelAndView("/register");
//        TUser user = new TUser(username, password);
//        int i = userService.addUser(user);
//        if (i == 1){
//            return true;
//        }
//        return false;
//    }
}
