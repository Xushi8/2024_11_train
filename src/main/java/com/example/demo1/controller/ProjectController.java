package com.example.demo1.controller;

import com.example.demo1.pojo.Project;
import com.example.demo1.service.ProjectService;
import com.example.demo1.service.ProjectServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

public @RestController
class ProjectController {
    @Autowired
    private ProjectServiceImpl projectServiceImpl;

    @RequestMapping("/insert_project")
    public int insert_project(Project project){
        return projectServiceImpl.insert_project(project);
    }

    @RequestMapping("/delete_project_by_id")
    public int delete_project_by_id(@Param("id") int id){
        return projectServiceImpl.delete_project_by_id(id);
    }
    @RequestMapping("/delete_project_by_ids")
    public int delete_project_by_ids(int[] ids){
        return projectServiceImpl.delete_project_by_ids(ids);
    }

    @RequestMapping("/update_project")
    public int update_project(Project project){
        return projectServiceImpl.update_project(project);
    }

    @RequestMapping("/select_all_projects")
    public List<Project> select_all_projects(){
        return projectServiceImpl.select_all_projects();
    }
    @RequestMapping("/select_project_by_id")
    public Project select_project_by_id(@Param("id") int id){
        return projectServiceImpl.select_project_by_id(id);
    }
    @RequestMapping("/select_project_by_name")
    public Project select_project_by_name(@Param("name") String name){
        return projectServiceImpl.select_project_by_name(name);
    }
    @RequestMapping("/select_projects_by_tenant_id")
    public List<Project> select_projects_by_tenant_id(@Param("tenant_id") int id){
        return projectServiceImpl.select_projects_by_tenant_id(id);
    }
}
