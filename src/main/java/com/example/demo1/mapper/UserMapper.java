package com.example.demo1.mapper;

import com.example.demo1.pojo.User;

import java.util.List;

public interface UserMapper {
    public List<User> select_all_users();
    public User select_user_by_id(int id);
    public default User select_user(User user){
        return select_user_by_id(user.getID());
    }
    public User select_user_by_Name(String Name);
}
