package com.zdxh.service;

import com.zdxh.entity.TClass;
import com.zdxh.entity.TOrder;
import com.zdxh.mapper.TClassMapper;
import com.zdxh.mapper.TOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TClassService {
    @Autowired
    TClassMapper classMapper;

    //增：添加用户
    public int addClass(TClass tClass){
        return classMapper.addClass(tClass);
    }
    //删：删除用户
    public int deleteClassById(Integer id){
        return classMapper.deleteClassById(id);
    }
    //改：更新用户
    public int updateClass(TClass tClass){
        return classMapper.updateClass(tClass);
    }
    //查：通过id获取用户
    public TClass getClassById(Integer id){
        return classMapper.getClassById(id);
    }
    //查：获取所有用户
    public List<TClass> getAllClasses(){
        return classMapper.getAllClasses();
    }


}
