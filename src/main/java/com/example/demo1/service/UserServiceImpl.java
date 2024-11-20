package com.example.demo1.service;

import com.example.demo1.mapper.UserMapper;
import com.example.demo1.pojo.User;
import com.example.demo1.service.UserService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Resource
    private UserMapper userMapper;


    public int insert_user(User user) {
        return userMapper.insert_user(user);
    }

    public int delete_user_by_id(int id){
        return userMapper.delete_user_by_id(id);
    }
    public int delete_user_by_ids(int[] ids){
        return userMapper.delete_user_by_ids(ids);
    }

    public int update_user(User user){
        return userMapper.update_user(user);
    }

    public List<User> select_all_users(){

        return userMapper.select_all_users();
    }
    public User select_user_by_id(int id){
        return userMapper.select_user_by_id(id);
    }
    public User select_user_by_name(String name){
        return userMapper.select_user_by_name(name);
    }
    public User select_user_by_name_and_password(String name, String password){
        return userMapper.select_user_by_name_and_password(name, password);
    }
    public List<User> select_users_by_project_id(int id){
        return userMapper.select_users_by_project_id(id);
    }

    public List<String> select_names_by_user_role(int role){
        return userMapper.select_names_by_user_role(role);
    }
}
