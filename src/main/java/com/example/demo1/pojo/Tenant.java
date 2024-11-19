package com.example.demo1.pojo;

public class Tenant {
    private Integer id;
    private String name;
    private String password;
    private String contact_name;
    private String phone;
    private String communication_address;
    private String postal_code;
    private String email;
    private Integer role;

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", contact_name='" + contact_name + '\'' +
                ", phone='" + phone + '\'' +
                ", communication_address='" + communication_address + '\'' +
                ", postal_code='" + postal_code + '\'' +
                ", email='" + email + '\'' +
                ", role=" + role +
                '}';
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

    public String getContact_name() {
        return contact_name;
    }

    public void setContact_name(String contact_name) {
        this.contact_name = contact_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCommunication_address() {
        return communication_address;
    }

    public void setCommunication_address(String communication_address) {
        this.communication_address = communication_address;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }
}
