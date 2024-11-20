package com.example.demo1.controller;

import com.example.demo1.pojo.Project;
import com.example.demo1.service.ProjectService;
import com.example.demo1.service.ProjectServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public @RestController
class ProjectController {
    @Autowired
    private ProjectServiceImpl projectServiceImpl;

    @RequestMapping("/insert_project")
    public int insert_project(Project project){
        return projectServiceImpl.insert_project(project);
    }

    @RequestMapping("/delete_project_by_id")
    public Map delete_project_by_id(@RequestBody Map<String, Object> payload){
        int id = (int) payload.get("id");
        int i = projectServiceImpl.delete_project_by_id(id);
        Map map = new HashMap();
        if(i != 0)
        {
            map.put("isOk", true);
            map.put("msg","删除成功");
            return map;
        }else{
            map.put("isOk", false);
            map.put("msg","删除失败");
            return map;
        }
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
    public Map select_all_projects(){
        List<Project> projectList = projectServiceImpl.select_all_projects();
        Map map = new HashMap();
        map.put("isOk", true);
        map.put("projects", projectList);
        map.put("msg","查询成功");
        return map;
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

    @RequestMapping("/update_endDate_by_projectId")
    public Map update_endDate_by_projectId (@RequestBody Map<String, Object> payload){
        int id = (int) payload.get("id");
        String endDateString = (String) payload.get("evaluationEndDate"); // 提取日期字符串
        LocalDate endDate = LocalDate.parse(endDateString); // 转换为 LocalDate
        int i = projectServiceImpl.update_endDate_by_projectId(id, endDate);
        Map map = new HashMap();
        map.put("isOk", true);
        map.put("msg","日期确认成功");
        return map;
    }
}
