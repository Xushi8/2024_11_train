package com.example.demo1.pojo;

public class ProjectUser {
    private Integer ProjectID;
    private Integer UserID;

    @Override
    public String toString() {
        return "ProjectUser{" +
                "ProjectID=" + ProjectID +
                ", UserID=" + UserID +
                '}';
    }

    public Integer getProjectID() {
        return ProjectID;
    }

    public void setProjectID(Integer projectID) {
        ProjectID = projectID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }
}
