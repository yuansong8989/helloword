package com.springboot.service.impl;

import com.springboot.dao.UsersMapper;
import com.springboot.entity.User;
import com.springboot.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by yzd on 2019/1/16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    //注入接口dao
    private UsersMapper usersMapper;

    @Override
    public User MainLogin(String username,String password) {
      User user= usersMapper.MainLogin(username,password);
      return user;
    }
}
