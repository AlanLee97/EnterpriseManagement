package com.zdxh.controller;

import com.zdxh.entity.TUser;
import com.zdxh.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {
    @Autowired
    TUserService userService;

    /**
     * 登录处理
     * @param userUsername
     * @param userPassword
     * @return
     */
    @RequestMapping(value = "/loginDo2",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView loginDo(String userUsername, String userPassword){
        ModelAndView mv = new ModelAndView("/home/index");
        boolean b = userService.getUserByUsernamePassword(new TUser(userUsername, userPassword));
        if (b){
            System.out.println("登录成功");
            mv.addObject("loginState", true);
            mv.addObject("username", userUsername);

            return mv;
        }else {
            System.out.println("登录失败");
            return mv.addObject("loginState", false);
        }

    }

    @RequestMapping("/logout")
    public ModelAndView logout(){
        ModelAndView mv = new ModelAndView("/home/index");
        return mv.addObject("loginState", false);
    }

}
