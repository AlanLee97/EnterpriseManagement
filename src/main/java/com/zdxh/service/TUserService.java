package com.zdxh.service;

import com.zdxh.entity.TUser;
import com.zdxh.mapper.TUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TUserService {
    @Autowired
    TUserMapper userMapper;

    //增：添加用户
    public int addUser(TUser user){
        return userMapper.addUser(user);
    }
    //删：删除用户
    public int deleteUserById(Integer id){
        return userMapper.deleteUserById(id);
    }
    //改：更新用户
    public int updateUser(TUser user){
        return userMapper.updateUser(user);
    }

    //查：通过id获取用户具体信息
    public TUser getOneUser(Integer id){
        return userMapper.getOneUser(id);
    }

    //查：通过id获取用户
    public TUser getUserById(Integer id){
        return userMapper.getUserById(id);
    }
    //查：获取所有用户
    public List<TUser> getAllUsers(){
        List<TUser> allUsers = userMapper.getAllUsers();
//        for (TUser u : allUsers) {
//            System.out.println("========== TUserService：" + u);
//        }
        return allUsers;
    }


    public boolean getUserByUsernamePassword(TUser user) {
        TUser user1 = userMapper.getUserByUsernamePassword(user);
//        System.out.println("========== TUserService：" + user1);
        return user1 != null;
    }
}
