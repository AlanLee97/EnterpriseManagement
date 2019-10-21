package com.zdxh.mapper;


import com.zdxh.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {
    //增：添加用户
    int addUser(User user);
    //删：删除用户
    int deleteUserById(Integer id);
    //改：更新用户
    int updateUser(User user);
    //查：通过id获取用户
    User getUserById(Integer id);
    //查：获取所有用户
    List<User> getAllUsers();
}
