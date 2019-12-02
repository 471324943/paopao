package com.czxy.paopao.service.impl;

import org.apache.dubbo.config.annotation.Service;
import javax.annotation.Resource;
import com.czxy.paopao.mapper.UserMapper;
import com.czxy.paopao.service.UserService;

@Service(version = "1.0.0")
public class UserServiceImpl implements UserService{

    @Resource
    private UserMapper userMapper;



}
