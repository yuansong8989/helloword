package com.springboot.controller;

import com.alibaba.fastjson.JSONObject;
import com.springboot.entity.MeiJu;
import com.springboot.entity.ResultModel;
import com.springboot.entity.ResultUt;
import com.springboot.entity.User;
import com.springboot.service.impl.UserServiceImpl;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by yzd on 2019/1/15.
 */
@RestController
//@Controller
public class TestController {
    //调用服务层注入
    @Resource
    private UserServiceImpl userService;
    @PostMapping("mainlogin")
    public ResultModel MainLogin(@RequestBody User user){
    if(userService.MainLogin(user.getUsername(),user.getPassword())!=null){
        JSONObject object = new JSONObject();
        object.put("token", "123");
        return ResultUt.success(object);
        }
        else{
        return ResultUt.error(MeiJu.login_password_error);
    }
    }
}
