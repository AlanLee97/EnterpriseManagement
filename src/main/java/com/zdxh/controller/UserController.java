package com.zdxh.controller;


import com.zdxh.entity.User;
import com.zdxh.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;

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

}
