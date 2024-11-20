package com.example.demo1.controller;

import com.example.demo1.pojo.Tenant;
import com.example.demo1.pojo.User;
import com.example.demo1.service.TenantService;
import com.example.demo1.service.TenantServiceImpl;
import com.example.demo1.service.UserServiceImpl;
import io.swagger.v3.oas.annotations.Parameter;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserServiceImpl userServiceImpl;
    @Autowired
    private TenantServiceImpl tenantServiceImpl;

    @RequestMapping("/insert_user")
    public Map insert_user(@RequestBody Map request) {


        String Name = (String) request.get("username");
        String Password = (String) request.get("password");
        String RoleString = (String) request.get("role");

        Integer Role=-1;
        if (RoleString.equals("评估员")){
            Role=2;
        }else{
            Role=3;
        }
        String TenantName = (String) request.get("tenant");


        User user = new User(null,TenantName,Name, Role, Password);
        Map res = new HashMap();
        try {
            int result = userServiceImpl.insert_user(user);
            if (result > 0) {
                res.put("isOk", true);
            } else {
                res.put("isOk", false);
            }
        } catch (Exception e) {
            e.printStackTrace();
            res.put("isOk",false);
        }
        return res;

    }

    @RequestMapping("/delete_user_by_id")
    public int delete_user_by_id(int id){
        return userServiceImpl.delete_user_by_id(id);
    }
    @RequestMapping("/delete_user_by_ids")
    public Integer delete_user_by_ids(@RequestBody Map request){

        List<Integer> idsList = (List<Integer>) request.get("ids");
        int[] ids=new int[idsList.size()];

        for(int i=0;i<idsList.size();i++){
            ids[i]=idsList.get(i);
        }

        return userServiceImpl.delete_user_by_ids(ids);
    }

    @RequestMapping("/update_user")
    public int update_user(@RequestBody Map request){

        String Name = (String) request.get("name");
        String Password = (String) request.get("password");
        Integer RoleString = (Integer) request.get("role");
        String TenantName = (String) request.get("tenant_name");
        Integer id=(Integer) request.get("id");
        User user = new User(id,TenantName,Name, RoleString, Password);

        int result=userServiceImpl.update_user(user);
        return result;
    }

//    @RequestMapping("/select_all_users")
//    public List<User> select_all_users(){
//        return userServiceImpl.select_all_users();
//    }
//    @RequestMapping("/select_user_by_id")
//    public User select_user_by_id(int id){
//        return userServiceImpl.select_user_by_id(id);
//    }
//    @RequestMapping("/select_user_by_name")
//    public User select_user_by_name(String name){
//        return userServiceImpl.select_user_by_name(name);
//    }

    @RequestMapping("/select_user_by_name_and_password")
    public Map select_user_by_name_and_password(@RequestParam("name") String name, @RequestParam("password") String password, @RequestParam("role") Integer role){
        Map map = new HashMap();
        if(role == 1) { // 租户
            Tenant tenant = tenantServiceImpl.select_tenant_by_name_and_password(name, password);
            if(tenant != null) {
                map.put("isOk", true);
                map.put("msg", "查询成功");
                map.put("data", tenant);
            } else {
                map.put("isOk", false);
                map.put("msg", "用户名或密码错误");
                map.put("data", null);
            }
        } else { // 用户
            User user = userServiceImpl.select_user_by_name_and_password(name, password);
            if(user != null) {
                map.put("data", user);
                map.put("isOk", true);
                map.put("msg", "查询成功");
            } else {
                map.put("isOk", false);
                map.put("msg", "用户名或密码错误");
                map.put("data", null);
            }
        }
        return map;
    }
//    @RequestMapping("/select_users_by_project_id")
//    public List<User> select_users_by_project_id(@Param("project_id") int id){
//        return userServiceImpl.select_users_by_project_id(id);
//    }

    @RequestMapping("/select_names_by_user_role")
    public Map select_names_by_user_role(@RequestBody Map request){
        int role = (Integer) request.get("role");
        List<String> res = userServiceImpl.select_names_by_user_role(role);
        Map map = new HashMap();
        map.put("isOK", res.size() > 0);
        map.put("msg", res.size() > 0 ? "查询成功" : "查询失败");
        map.put("nameList", res);
        return map;
    }
}
