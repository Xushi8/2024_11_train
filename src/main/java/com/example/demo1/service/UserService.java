package com.example.demo1.service;

import com.example.demo1.mapper.UserMapper;
import com.example.demo1.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> select_all_users() {
        return userMapper.select_all_users();
    }
}
