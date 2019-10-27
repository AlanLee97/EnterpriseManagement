package com.zdxh.controller;


import com.zdxh.entity.User;
import com.zdxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

    /**
     * 页面：添加用户
     * @return
     */
    @RequestMapping("/viewAddUser")
    public ModelAndView viewAddUser(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/viewAddUser");
        return mv;
    }
    /**
     * 页面：客服
     * @return
     */
    @RequestMapping("/robotService")
    public ModelAndView robotService(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/robotService");
        return mv;
    }

    /**
     * 增：添加用户
     */
    @GetMapping("/addUser")
    public String addUser(String username, String password){
        User user = new User(username, password);
        int i = userService.addUser(user);
        return 1 == i ? "添加成功" : "添加失败";
    }

    /**
     * 删：通过id删除用户
     * @param id
     * @return
     */
    @GetMapping("/deleteUserById")
    public String deleteUserById(int id){
        int i = userService.deleteUserById(id);
        return 1 == i ? "删除成功" : "删除失败";
    }

    /**
     * 改：更新用户信息
     * @param id
     * @param username
     * @param password
     * @return
     */
    @GetMapping("/updateUser")
    public String updateUser(int id, String username, String password){
        User user = new User();
        user.setId(id);
        user.setUsername(username);
        user.setPassword(password);
        int i = userService.updateUser(user);
        return 1 == i ? "更新成功" : "更新失败";
    }

    /**
     * 查：通过id查询用户
     * @param id
     * @return
     */
    @GetMapping("/getUserById")
    public String getUserById(Integer id){
        User user = userService.getUserById(id);
        return user != null ? "查询成功: " + user.toString() : "查询失败";
    }

    /**
     * 查：查询所有用户
     * @return
     */
    @GetMapping("/getAllUsers")
    public String getAllUsers(){
        List<User> userList = userService.getAllUsers();
        StringBuffer buffer = new StringBuffer();
        if (!userList.isEmpty() && userList != null){
            for (User u : userList) {
                buffer.append(u + " -- ");
            }
        }
        return buffer.toString();
    }
    /**
     * 页面：客服
     * @return
     */
    @RequestMapping("/GongSiJieShao")
    public ModelAndView GongSiJieShao(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("/GongSiJieShao");
        return mv;
    }


    @RequestMapping("/register")
    public ModelAndView registerView(){
        return new ModelAndView("/register");
    }

    @RequestMapping(value = "/registerDo", method = RequestMethod.POST)
    public boolean register(String username, String password){
        ModelAndView mv = new ModelAndView("/register");
        User user = new User(username, password);
        int i = userService.addUser(user);
        if (i == 1){

            return true;
        }
        return false;
    }

    @RequestMapping("/login")
    public ModelAndView loginView(){
        return new ModelAndView("/login");
    }

    @RequestMapping(value = "/loginDo", method = RequestMethod.POST)
    public ModelAndView login(String username, String password){
        ModelAndView mv = new ModelAndView("/login");
        User user = new User(username, password);
        boolean b = userService.getUserByUsernamePassword(user);
        if (b){
            mv.addObject("loginState", "登录成功");
        }else {
            mv.addObject("loginState", "登录失败");
        }
        return mv;
    }

//    @RequestMapping("/test")
//    public ModelAndView test(){
//        return new ModelAndView("/test");
//    }

}
