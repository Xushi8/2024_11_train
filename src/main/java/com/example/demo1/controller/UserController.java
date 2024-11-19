package com.example.demo1.controller;

import com.example.demo1.pojo.User;
import com.example.demo1.service.UserServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;

    @RequestMapping("/insert_user")
    public int insert_user(User user) {
        return userServiceImpl.insert_user(user);
    }

    @RequestMapping("/delete_user_by_id")
    public int delete_user_by_id(int id){
        return userServiceImpl.delete_user_by_id(id);
    }
    @RequestMapping("/delete_user_by_ids")
    public int delete_user_by_ids(int[] ids){
        return userServiceImpl.delete_user_by_ids(ids);
    }

    @RequestMapping("/update_user")
    public int update_user(User user){
        return userServiceImpl.update_user(user);
    }

    @RequestMapping("/select_all_users")
    public List<User> select_all_users(){
        return userServiceImpl.select_all_users();
    }
    @RequestMapping("/select_user_by_id")
    public User select_user_by_id(int id){
        return userServiceImpl.select_user_by_id(id);
    }
    @RequestMapping("/select_user_by_name")
    public User select_user_by_name(String name){
        return userServiceImpl.select_user_by_name(name);
    }
    @RequestMapping("/select_user_by_name_and_password")
    public User select_user_by_name_and_password(@Param("name") String name, @Param("password") String password){
        return userServiceImpl.select_user_by_name_and_password(name, password);
    }
    @RequestMapping("/select_users_by_project_id")
    public List<User> select_users_by_project_id(@Param("project_id") int id){
        return userServiceImpl.select_users_by_project_id(id);
    }
}
