package com.zdxh.controller;

import com.zdxh.entity.Api;
import com.zdxh.entity.TClass;
import com.zdxh.service.TClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TClassController {

    @Autowired
    TClassService classService;

    @RequestMapping("/addClassDoApi")
    @ResponseBody
    public Api addClass(String classNum, String className){
        TClass tClass = new TClass();
        tClass.setClassNum(classNum);
        tClass.setClassName(className);
        int i = classService.addClass(tClass);
        if (i == 1){
            return new Api(200, "ok", tClass);
        }else {
            return new Api(400, "error", null);
        }
    }
}
