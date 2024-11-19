package com.example.demo1.service;

import com.example.demo1.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    public int insert_user(User user);

    public int delete_user_by_id(int id);
    public int delete_user_by_ids(int[] ids);

    public int update_user(User user);

    public List<User> select_all_users();
    public User select_user_by_id(int id);
    public User select_user_by_name(String name);
    public User select_user_by_name_and_password(String name, String password);
    public List<User> select_users_by_project_id(int id);
}
