package com.zdxh.controller;


import com.zdxh.entity.Api;
import com.zdxh.entity.TCustomer;
import com.zdxh.entity.TUser;
import com.zdxh.service.TCustomerService;
import com.zdxh.service.TUserService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.TemplateEngine;


import java.util.concurrent.ExecutorService;


@Controller
public class RegisterController {
    @Autowired
    TUserService userService;

    @Autowired
    TCustomerService customerService;

    /**
     * 注册用户处理
     * @param userUsername
     * @param userPassword
     * @return
     */
    @RequestMapping(value = "/registerUserDo",method = RequestMethod.POST)
    @ResponseBody
    public Api<TUser> registerUserDo(String userUsername, String userPassword, String userEmail){
        TUser tUser = new TUser();
        tUser.setUserUsername(userUsername);
        tUser.setUserPassword(userPassword);
        tUser.setUserEmail(userEmail);
        System.out.println("======TUserController:" + tUser);
        int i = userService.addUser(tUser);
        if (i == 1){

            return new Api<>(200, "ok", tUser);
        }else {
            return new Api<>(400, "error", null);
        }
    }

    /**
     * 注册客户处理
     */
    @RequestMapping(value = "/registerCustomerDo",method = RequestMethod.POST)
    @ResponseBody
    public Api<TCustomer> registerCustomerDo(
            String custUsername,
            String custPassword,
            String custBuName,
            String custBuAddress,
            String custBuContactor,
            String custBuPhone,
            String custBuIntroduction,
            String custEmail
    ){
        TCustomer customer = new TCustomer();
        customer.setCustUsername(custUsername);
        customer.setCustPassword(custPassword);
        customer.setCustBuName(custBuName);
        customer.setCustBuAddress(custBuAddress);
        customer.setCustBuContactor(custBuContactor);
        customer.setCustBuPhone(custBuPhone);
        customer.setCustBuIntroduction(custBuIntroduction);
        customer.setCustEmail(custEmail);
        int i = customerService.addCustomer(customer);
        if (i == 1){
            return new Api<>(200, "ok", customer);
        }else {
            return new Api<>(400, "error", null);
        }
    }
}
