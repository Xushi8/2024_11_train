package com.example.demo1.controller;

import com.example.demo1.pojo.Tenant;
import com.example.demo1.pojo.User;
import com.example.demo1.service.TenantService;
import com.example.demo1.service.TenantServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TenantController {
    @Autowired
    private TenantServiceImpl tenantServiceImpl;

    @RequestMapping("/insert_tenant")
    public int insert_tenant(Tenant tenant){
        return tenantServiceImpl.insert_tenant(tenant);
    }

    @RequestMapping("/delete_tenant_by_id")
    public int delete_tenant_by_id(int id){
        return tenantServiceImpl.delete_tenant_by_id(id);
    }
    @RequestMapping("/delete_tenants_by_ids")
    public int delete_tenants_by_ids(int[] ids){
        return tenantServiceImpl.delete_tenants_by_ids(ids);
    }

    @RequestMapping("/update_tenant")
    public int update_tenant(Tenant tenant){
        return tenantServiceImpl.update_tenant(tenant);
    }

    @RequestMapping("/select_all_tenants")
    public List<Tenant> select_all_tenants(){
        return tenantServiceImpl.select_all_tenants();
    }
    @RequestMapping("/select_tenant_by_id")
    public Tenant select_tenant_by_id(int id){
        return tenantServiceImpl.select_tenant_by_id(id);
    }
    @RequestMapping("/select_tenant_by_name")
    public Tenant select_tenant_by_name(@Param("name") String name){
        return tenantServiceImpl.select_tenant_by_name(name);
    }
    @RequestMapping("/select_tenant_by_name_and_password")
    public Tenant select_tenant_by_name_and_password(@Param("name") String name, @Param("password") String password){
        return tenantServiceImpl.select_tenant_by_name_and_password(name, password);
    }
}
