package com.example.demo1.mapper;

import com.example.demo1.pojo.Tenant;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TenantMapper {
    public int insert_tenant(Tenant tenant);

    public int delete_tenant_by_id(int id);
    public int delete_tenants_by_ids(int[] ids);

    public int update_tenant(Tenant tenant);

    public List<Tenant> select_all_tenants();
    public Tenant select_tenant_by_id(int id);
    public Tenant select_tenant_by_name(@Param("tenant_name") String Name);
    public Tenant select_tenant_by_name_and_password(@Param("tenant_name") String Name, @Param("tenant_password") String Password);
}
