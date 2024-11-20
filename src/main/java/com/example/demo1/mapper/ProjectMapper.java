package com.example.demo1.mapper;

import com.example.demo1.pojo.Project;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.time.LocalDate;
import java.util.List;

@Mapper
public interface ProjectMapper {
    public int insert_project(Project project);

    public int delete_project_by_id(@Param("id") int id);
    public int delete_project_by_ids(int[] ids);

    public int update_project(Project project);

    public List<Project> select_all_projects();
    public Project select_project_by_id(@Param("id") int id);
    public Project select_project_by_name(@Param("name") String name);
    public List<Project> select_projects_by_tenant_id(@Param("tenant_id") int id);
    public int update_endDate_by_projectId(@Param("id") int id, @Param("endDate") LocalDate endDate);

    public LocalDate select_create_time_by_id(@Param("id") int id);
    public List<LocalDate> select_create_time_by_ids(int[] ids);
}
