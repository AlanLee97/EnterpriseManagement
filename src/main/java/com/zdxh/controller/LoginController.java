package com.zdxh.controller;

import com.zdxh.entity.Api;
import com.zdxh.entity.TCustomer;
import com.zdxh.entity.TUser;
import com.zdxh.service.TCustomerService;
import com.zdxh.service.TUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class LoginController {
    @Autowired
    TUserService userService;

    @Autowired
    TCustomerService customerService;

    /**
     * 用户登录处理
     * @param userUsername
     * @param userPassword
     * @return
     */
    @RequestMapping(value = "/loginUserDo",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView loginUserDo(String userUsername, String userPassword, HttpServletRequest request){
        ModelAndView mv = new ModelAndView("/home/index");
        TUser user = new TUser(userUsername, userPassword);
        boolean b = userService.getUserByUsernamePassword(user);
        if (b){
            System.out.println("登录成功");
            mv.addObject("username", user.getUserUsername());
            mv.addObject("loginState", true);
            request.setAttribute("loginState", true);
            request.setAttribute("username", user.getUserUsername());
            return mv;
        }else {
            System.out.println("登录失败");
            mv.addObject("loginState", false);

            return mv;
        }

    }


    /**
     * 客户登录处理
     * @param userUsername
     * @param userPassword
     * @return
     */
    @RequestMapping(value = "/loginCustomerDo",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView loginCustomerDo(String userUsername, String userPassword){
        ModelAndView mv = new ModelAndView("/home/index");
        String custUsername = userUsername;
        String custPassword = userPassword;
        TCustomer customer = new TCustomer(custUsername, custPassword);
        boolean b = customerService.getCustomerByUsernamePassword(customer);
        if (b){
            System.out.println("登录成功");
            mv.addObject("username", customer.getCustUsername());
            mv.addObject("loginState", true);
            return mv;
        }else {
            mv.addObject("loginState", false);
            System.out.println("登录失败");
            return mv;
        }

    }

    /**
     * 退出登录
     * @return
     */
    @RequestMapping("/logout")
    public ModelAndView logout(){
        ModelAndView mv = new ModelAndView("/home/index");
        return mv.addObject("loginState", false);
    }


    /**--------------------------- api：开始 ----------------------------**/

    /**
     * 用户登录处理api
     * @param userUsername
     * @param userPassword
     * @return
     */
    @RequestMapping(value = "/loginUserDoApi",method = RequestMethod.POST)
    @ResponseBody
    public Api loginUserDoApi(String userUsername, String userPassword){
        TUser user = new TUser(userUsername, userPassword);
        boolean b = userService.getUserByUsernamePassword(user);
        if (b){
            System.out.println("登录成功");
            return new Api(200, "ok", user);
        }else {
            System.out.println("登录失败");
            return new Api(400, "error", null);
        }

    }

    /**
     * 客户登录处理api
     * @param userUsername
     * @param userPassword
     * @return
     */
    @RequestMapping(value = "/loginCustomerDoApi",method = RequestMethod.POST)
    @ResponseBody
    public Api loginCustomerDoApi(String userUsername, String userPassword){
        String custUsername = userUsername;
        String custPassword = userPassword;
        TCustomer customer = new TCustomer(custUsername, custPassword);
        boolean b = customerService.getCustomerByUsernamePassword(customer);
        if (b){
            System.out.println("登录成功");
            return new Api(200, "ok", customer);
        }else {
            System.out.println("登录失败");
            return new Api(400, "error", null);
        }

    }

    /**============================ api：结束 ============================**/


}
