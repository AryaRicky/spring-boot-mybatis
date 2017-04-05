package com.service;

import com.mapper.UserMapper;
import com.po.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by lijianguo on 2017/3/28.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User findById(int id) {
        return userMapper.findById(id);
    }

    @Transactional //添加事务
    public void insertUser(User user) {
        userMapper.insert(user);
    }

}
