package com.zdxh.controller;

import com.zdxh.entity.Api;
import com.zdxh.entity.TUser;
import com.zdxh.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    /** --------------------------- 属性：开始--------------------------- **/
    @Autowired
    TUserService userService;

    /** =========================== 属性：结束 ============================== **/


    /** --------------------------- 返回的页面：开始--------------------------- **/
    @RequestMapping("/home")
    public ModelAndView index2(){
        return new ModelAndView("/home/index");
    }

    @RequestMapping("/home/register")
    public ModelAndView register(){
        return new ModelAndView("/home/register");
    }

    @RequestMapping("/home/login")
    public ModelAndView login(){
        return new ModelAndView("/home/login");
    }

    @RequestMapping("/home/dingdanzhongxin")
    public ModelAndView dingdanzhongxin(){
        return new ModelAndView("/home/dingdanzhongxin");
    }

    @RequestMapping("/home/gouwuche")
    public ModelAndView gouwuche(){
        return new ModelAndView("/home/gouwuche");
    }

    @RequestMapping("/home/liebiao")
    public ModelAndView liebiao(){
        return new ModelAndView("/home/liebiao");
    }

    @RequestMapping("/home/self_info")
    public ModelAndView self_info(){
        return new ModelAndView("/home/self_info");
    }

    @RequestMapping("/home/xiangqing")
    public ModelAndView xiangqing(){
        return new ModelAndView("/home/xiangqing");
    }

    /** =========================== 返回的页面：结束 ============================== **/


    /** --------------------------- 处理方法：开始--------------------------- **/
    /**
     * 注册处理
     * @param userUsername
     * @param userPassword
     * @return
     */
    @RequestMapping(value = "/registerDo2",method = RequestMethod.POST)
    @ResponseBody
    public Api<TUser> registerDo(String userUsername, String userPassword){
        int i = userService.addUser(new TUser(userUsername, userPassword));
        if (i == 1){
            return new Api<>(200, "ok", new TUser(userUsername, userPassword));
        }else {
            return new Api<>(400, "error", null);
        }
    }


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


    /** =========================== 处理方法：结束 ============================== **/





}
