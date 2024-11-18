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


        SqlSession sqlSession = sqlSessionFactory.openSession();

//        List<User> Users = sqlSession.selectList("test.select_all_user");
//        System.out.println(Users);


        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = userMapper.select_all_users();
        System.out.println(users);
        User user = userMapper.select_user_by_id(1);
        System.out.println(user);
        User user1 = userMapper.select_user(user);
        System.out.println(user1);
        User user2 = userMapper.select_user_by_Name("User B1");
        System.out.println(user2);

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
