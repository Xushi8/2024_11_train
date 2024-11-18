package com.example.demo1;

import com.example.demo1.mapper.ProjectMapper;
import com.example.demo1.mapper.ProjectUserMapper;
import com.example.demo1.mapper.TenantMapper;
import com.example.demo1.mapper.UserMapper;
import com.example.demo1.pojo.Project;
import com.example.demo1.pojo.ProjectUser;
import com.example.demo1.pojo.Tenant;
import com.example.demo1.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Demo {

    public static void main(String[] args) throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);


        SqlSession sqlSession = sqlSessionFactory.openSession(true);

//        List<User> Users = sqlSession.selectList("test.select_all_user");
//        System.out.println(Users);

        // user test
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.select_all_users();
        System.out.println(users);
        User user = userMapper.select_user_by_ID(1);
        System.out.println(user);
        User user1 = userMapper.select_user(user);
        System.out.println(user1);
        User user2 = userMapper.select_user_by_Name("User B1");
        System.out.println(user2);
        User user3 = userMapper.select_user_by_Name_and_Password("User B2", "password123");
        System.out.println(user3);
        User user4 = new User();
        user4.setName("insert");
        user4.setPassword("password123");
        user4.setRole(2);
        user4.setTenantName("Tenant A");
        int res = userMapper.insert_user(user4);
        System.out.println("增加的数量: " + res);
        int delete_id = 21;
        res = userMapper.delete_user_by_ID(delete_id);
        System.out.println("删除的数量: " + res);

        int[] delete_ids = {5, 6, 7, 8};
        res = userMapper.delete_user_by_IDS(delete_ids);
        System.out.println("批量删除的数量: " + res);

        user1.setPassword("update");
        res = userMapper.update_user(user1);
        System.out.println("修改的数量: " + res);

        // Tenant
        TenantMapper tenantMapper = sqlSession.getMapper(TenantMapper.class);
        List<Tenant> tenants = tenantMapper.select_all_tenants();
        System.out.println(tenants);

        ProjectMapper projectMapper = sqlSession.getMapper(ProjectMapper.class);
        List<Project> projects = projectMapper.select_all_projects();
        System.out.println(projects);

        ProjectUserMapper projectUserMapper = sqlSession.getMapper(ProjectUserMapper.class);
        List<ProjectUser> projectUsers = projectUserMapper.select_all_project_users();
        System.out.println(projectUsers);


        System.out.println("1kj32kl1j3");
        sqlSession.close();
    }
}
