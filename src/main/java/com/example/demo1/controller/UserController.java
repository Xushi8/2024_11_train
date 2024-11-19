package com.example.demo1.controller;

import com.example.demo1.pojo.User;
import com.example.demo1.server.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping
    public List<User> select_all_users() {
        return userService.select_all_users();
    }
}
