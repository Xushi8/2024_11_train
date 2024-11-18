package com.example.demo1.mapper;

import com.example.demo1.pojo.Tenant;

import java.util.List;

public interface TenantMapper {

    public List<Tenant> select_all_tenants();
}
