package com.zdxh.mapper;

import com.zdxh.entity.TUser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface TUserMapper {
    //增：添加用户
    int addUser(TUser user);
    //删：删除用户
    int deleteUserById(Integer id);
    //改：更新用户
    int updateUser(TUser user);

    //查：通过id获取用户具体信息
    TUser getOneUser(Integer id);

    //查：通过用户名获取用户
    TUser getUserById(Integer id);
    //查：通过用户名获取用户
    TUser getUserByUsernamePassword(TUser user);
    //查：获取所有用户
    List<TUser> getAllUsers();

}
