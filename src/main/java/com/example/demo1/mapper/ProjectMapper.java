package com.example.demo1.mapper;

import com.example.demo1.pojo.Project;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ProjectMapper {
    public int insert_project(Project project);

    public int delete_project_by_id(@Param("id") int id);
    public int delete_project_by_ids(int[] ids);

    public int update_project(Project project);

    public List<Project> select_all_projects();
    public Project select_project_by_id(@Param("project_id") int ID);
    public Project select_project_by_name(@Param("project_name") String Name);
    public List<Project> select_projects_by_tenant_id(@Param("tenant_id") int ID);
}
