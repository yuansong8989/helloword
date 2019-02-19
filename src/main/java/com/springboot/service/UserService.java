package com.springboot.service;

import com.springboot.entity.User;

/**
 * Created by yzd on 2019/1/16.
 */
public interface UserService {


    User MainLogin(String username,String userpassword);
}
