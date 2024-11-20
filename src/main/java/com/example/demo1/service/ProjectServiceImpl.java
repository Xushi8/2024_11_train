package com.example.demo1.service;

import com.example.demo1.mapper.ProjectMapper;
import com.example.demo1.pojo.Project;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.util.List;

@Service
public class ProjectServiceImpl implements ProjectService {
    @Resource
    private ProjectMapper projectMapper;

    public int insert_project(Project project){
        return projectMapper.insert_project(project);
    }

    public int delete_project_by_id(int id){
        return projectMapper.delete_project_by_id(id);
    }
    public int delete_project_by_ids(int[] ids){
        return projectMapper.delete_project_by_ids(ids);
    }

    public int update_project(Project project){
        return projectMapper.update_project(project);
    }

    public List<Project> select_all_projects(){
        return projectMapper.select_all_projects();
    }
    public Project select_project_by_id(int id){
        return projectMapper.select_project_by_id(id);
    }
    public Project select_project_by_name(String name){
        return projectMapper.select_project_by_name(name);
    }
    public List<Project> select_projects_by_tenant_id(int id){
        return projectMapper.select_projects_by_tenant_id(id);
    }


    public LocalDate select_create_time_by_id(int id){
        return projectMapper.select_create_time_by_id(id);
    }
    public List<LocalDate> select_create_time_by_ids(int[] ids){
        return projectMapper.select_create_time_by_ids(ids);
    }
}
