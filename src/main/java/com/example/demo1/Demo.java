package com.example.demo1;

import com.example.demo1.mapper.TenantMapper;
import com.example.demo1.mapper.UserMapper;
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

        TenantMapper tenantMapper = sqlSession.getMapper(TenantMapper.class);
        List<Tenant> tenants = tenantMapper.select_all_tenants();
        System.out.println(tenants);

        sqlSession.close();
    }
}
