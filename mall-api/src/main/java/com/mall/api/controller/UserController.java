package com.mall.api.controller;

import com.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 刘建波
 * @date 2020-02-29
 */

@RestController()
@RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public Object getUsers()
    {
        return userService.getUserList();
    }
}
