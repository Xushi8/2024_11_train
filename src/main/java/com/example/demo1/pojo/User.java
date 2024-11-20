package com.example.demo1.pojo;

public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer role;
    private String tenant_name;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", role=" + role +
                ", tenant_name='" + tenant_name + '\'' +
                '}';
    }

    public User(Integer id,String TenantName, String Name, Integer role, String password) {
        this.id = id;
        this.tenant_name = TenantName;
        this.name = Name;
        this.role = role;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getTenant_name() {
        return tenant_name;
    }

    public void setTenant_name(String tenant_name) {
        this.tenant_name = tenant_name;
    }
}
