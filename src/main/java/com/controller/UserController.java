package com.controller;

import com.po.User;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lijianguo on 2017/3/28.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/findById/{id}")
    @ResponseBody
    public User findById(@PathVariable int id) {
        User user = userService.findById(id);
        return user;
    }
}
