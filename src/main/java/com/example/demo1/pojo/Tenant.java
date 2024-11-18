package com.example.demo1.pojo;

public class Tenant {
    private Integer ID;
    private String TenantName;
    private String ContactName;
    private String LoginPassword;
    private String Phone;
    private String CommunicationAddress;
    private String PostalCode;
    private String Email;
    private Integer Role;

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + ID +
                ", TenantName='" + TenantName + '\'' +
                ", ContactName='" + ContactName + '\'' +
                ", LoginPassword='" + LoginPassword + '\'' +
                ", Phone='" + Phone + '\'' +
                ", CommunicationAddress='" + CommunicationAddress + '\'' +
                ", PostalCode='" + PostalCode + '\'' +
                ", Email='" + Email + '\'' +
                ", Role=" + Role +
                '}';
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getTenantName() {
        return TenantName;
    }

    public void setTenantName(String tenantName) {
        TenantName = tenantName;
    }

    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getLoginPassword() {
        return LoginPassword;
    }

    public void setLoginPassword(String loginPassword) {
        LoginPassword = loginPassword;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCommunicationAddress() {
        return CommunicationAddress;
    }

    public void setCommunicationAddress(String communicationAddress) {
        CommunicationAddress = communicationAddress;
    }

    public String getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode(String postalCode) {
        PostalCode = postalCode;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Integer getRole() {
        return Role;
    }

    public void setRole(Integer role) {
        Role = role;
    }
}
