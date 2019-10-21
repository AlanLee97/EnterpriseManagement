package com.zdxh.service;


import com.zdxh.entity.User;
import com.zdxh.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    //增：添加用户
    public int addUser(User user){
        return userMapper.addUser(user);
    }
    //删：删除用户
    public int deleteUserById(Integer id){
        return userMapper.deleteUserById(id);
    }
    //改：更新用户
    public int updateUser(User user){
        return userMapper.updateUser(user);
    }
    //查：通过id获取用户
    public User getUserById(Integer id){
        return userMapper.getUserById(id);
    }
    //查：获取所有用户
    public List<User> getAllUsers(){
        return userMapper.getAllUsers();
    }
}
