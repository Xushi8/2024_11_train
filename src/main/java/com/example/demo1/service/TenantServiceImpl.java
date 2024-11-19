package com.example.demo1.service;

import com.example.demo1.mapper.TenantMapper;
import com.example.demo1.pojo.Tenant;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TenantServiceImpl implements TenantService {
    @Resource
    TenantMapper tenantMapper;

    public int insert_tenant(Tenant tenant) {
        return tenantMapper.insert_tenant(tenant);
    }

    public int delete_tenant_by_id(int id){
        return tenantMapper.delete_tenant_by_id(id);
    }
    public int delete_tenants_by_ids(int[] ids){
        return tenantMapper.delete_tenants_by_ids(ids);
    }

    public int update_tenant(Tenant tenant){
        return tenantMapper.update_tenant(tenant);
    }

    public List<Tenant> select_all_tenants(){
        return tenantMapper.select_all_tenants();
    }
    public Tenant select_tenant_by_id(int id){
        return tenantMapper.select_tenant_by_id(id);
    }
    public Tenant select_tenant_by_name(String name){
        return tenantMapper.select_tenant_by_name(name);
    }
    public Tenant select_tenant_by_name_and_password(String name, String password){
        return tenantMapper.select_tenant_by_name_and_password(name, password);
    }
}
