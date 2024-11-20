package com.example.demo1.service;

import com.example.demo1.pojo.Project;

import java.time.LocalDate;
import java.util.List;

public interface ProjectService {
    public int insert_project(Project project);

    public int delete_project_by_id(int id);
    public int delete_project_by_ids(int[] ids);

    public int update_project(Project project);

    public List<Project> select_all_projects();
    public Project select_project_by_id(int id);
    public Project select_project_by_name(String name);
    public List<Project> select_projects_by_tenant_id(int id);


    public LocalDate select_create_time_by_id(int id);
    public List<LocalDate> select_create_time_by_ids(int[] ids);
}
