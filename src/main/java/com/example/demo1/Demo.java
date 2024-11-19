package com.example.demo1;

import com.example.demo1.mapper.UserMapper;
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
        User user = userMapper.select_user_by_id(1);
        System.out.println(user);
        User user2 = userMapper.select_user_by_name("User B1");
        System.out.println(user2);
        User user3 = userMapper.select_user_by_name_and_password("User B2", "password123");
        System.out.println(user3);
        User user4 = new User();
        user4.setName("insert");
        user4.setPassword("password123");
        user4.setRole(2);
        user4.setTenant_name("Tenant A");
        int res = userMapper.insert_user(user4);
        System.out.println("增加的数量: " + res);
        int delete_id = 21;
        res = userMapper.delete_user_by_id(delete_id);
        System.out.println("删除的数量: " + res);

        int[] delete_ids = {5, 6, 7, 8};
        res = userMapper.delete_user_by_ids(delete_ids);
        System.out.println("批量删除的数量: " + res);

        user2.setPassword("update");
        res = userMapper.update_user(user2);
        System.out.println("修改的数量: " + res);

        List<User> users2 = userMapper.select_users_by_project_id(7);
        System.out.println(users2);

        // Tenant
        /*
        TenantMapper tenantMapper = sqlSession.getMapper(TenantMapper.class);
        List<Tenant> tenants = tenantMapper.select_all_tenants();
        System.out.println(tenants);

        Tenant tenant = new Tenant();
        tenant.setTenantName("insert");
        tenant.setContactName("insert");
        tenant.setLoginPassword("password123");
        tenant.setPhone("insert");
        tenant.setCommunicationAddress("insert");
        tenant.setPostalCode("insert");
        tenant.setEmail("insert");
        tenant.setRole(1);
        int res = tenantMapper.insert_tenant(tenant);
        System.out.println("增加的数量: " + res);
        int delete_id = 21;
        res = tenantMapper.delete_tenant_by_ID(delete_id);
        System.out.println("删除的数量: " + res);
        int[] delete_ids = {23, 24, 10000};
        res = tenantMapper.delete_tenants_by_IDS(delete_ids);
        System.out.println("批量删除的数量: " + res);

        int id = 15;
        Tenant tenant1 = tenantMapper.select_tenant_by_ID(id);
        System.out.println(tenant1);
        tenant1.setContactName("update");
        tenant1.setLoginPassword(null);
        tenant1.setPhone(null);
        res = tenantMapper.update_tenant(tenant1);
        System.out.println("修改的数量: " + res);
        Tenant tenant2 = tenantMapper.select_tenant_by_Name("Tenant A");
        System.out.println(tenant2);
        Tenant tenant3 = tenantMapper.select_tenant_by_Name_and_Password("Tenant B", "password1232311231212");
        System.out.println(tenant3);
        */

        // project
        /*
        ProjectMapper projectMapper = sqlSession.getMapper(ProjectMapper.class);
        List<Project> projects = projectMapper.select_all_projects();
        System.out.println(projects);
        projects.get(5).setProject_name("insert");
        int res = projectMapper.insert_project(projects.get(5));
        System.out.println("增加的数量: " + res);

        res = projectMapper.delete_project_by_ID(5);
        System.out.println("删除的数量: " + res);
        int[] delete_ids = {12, 13, 16};
        res = projectMapper.delete_project_by_IDS(delete_ids);
        System.out.println("批量删除的数量: " + res);

        projects.get(3).setProject_name("update");
        res = projectMapper.update_project(projects.get(3));
        System.out.println("修改的数量: " + res);

        Project p1 = projectMapper.select_project_by_Name("Project Eta");
        System.out.println(p1);

        projects = projectMapper.select_projects_by_tenant_id(2);
        System.out.println(projects);
        */

        sqlSession.close();
    }
}
