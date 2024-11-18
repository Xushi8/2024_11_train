package com.example.demo1.mapper;

import com.example.demo1.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapper {
    int insert_user(User user);

    int delete_user_by_ID(int ID);
    int delete_user_by_IDS(int[] IDS); // 这个的命名无所谓

    int update_user(User user);

    public List<User> select_all_users();
    public User select_user_by_ID(int ID);
    public User select_user_by_Name(String Name);
    public User select_user_by_Name_and_Password(@Param("Name") String Name, @Param("Password") String Password);
}
