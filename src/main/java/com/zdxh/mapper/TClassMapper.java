package com.zdxh.mapper;

import com.zdxh.entity.TClass;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TClassMapper {

    //增：添加类别
    int addClass(TClass tClass);
    //删：删除类别
    int deleteClassById(Integer id);
    //改：更新类别
    int updateClass(TClass tClass);
    //查：通过id获取类别
    TClass getClassById(Integer id);

    //查：获取所有类别
    List<TClass> getAllClasses();

}
