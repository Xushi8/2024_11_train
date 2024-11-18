package com.example.demo1.mapper;

import com.example.demo1.pojo.Tenant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenantMapper {
    public int insert_tenant(Tenant tenant);

    public int delete_tenant_by_ID(int ID);
    public int delete_tenants_by_IDS(int[] IDS);

    public int update_tenant(Tenant tenant);

    public List<Tenant> select_all_tenants();
    public Tenant select_tenant_by_ID(int ID);
    public Tenant select_tenant_by_Name(@Param("TenantName") String Name);
    public Tenant select_tenant_by_Name_and_Password(@Param("TenantName") String Name, @Param("LoginPassword") String Password);
}
