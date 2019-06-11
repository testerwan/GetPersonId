package com.zhongan.service;

import com.zhongan.entity.User;
import com.zhongan.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;



    public User findUserByIdNo(String  idNo){
        return userMapper.findUserByIdNo(idNo);
    }

    public void insert(User user){
        userMapper.insert(user);
    }

}
