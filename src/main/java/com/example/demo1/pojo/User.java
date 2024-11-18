package com.example.demo1.pojo;

public class User {
    private Integer ID;
    private String Name;
    private String Password;
    private Integer Role;
    private String TenantName;


    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        this.Password = password;
    }

    public Integer getRole() {
        return Role;
    }

    public void setRole(Integer role) {
        this.Role = role;
    }

    public String getTenantName() {
        return TenantName;
    }

    public void setTenantName(String tenantName) {
        TenantName = tenantName;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", Password='" + Password + '\'' +
                ", Role=" + Role +
                ", TenantName='" + TenantName + '\'' +
                '}';
    }
}
