package com.example.demo1.controller;

import com.example.demo1.pojo.Project;
import com.example.demo1.service.ProjectService;
import com.example.demo1.service.ProjectServiceImpl;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public @RestController
class ProjectController {
    @Autowired
    private ProjectServiceImpl projectServiceImpl;

    @RequestMapping("/insert_project")
    public Map insert_project(Project project){ // project 需要使用 Map, request.get("xxx"), 然后手动创建一个project
        int res = projectServiceImpl.insert_project(project);
        Map map = new HashMap();
        map.put("isOK", res == 1);
        map.put("msg", res == 1 ? "添加成功" : "添加失败");
        return map;
    }

    @RequestMapping("/delete_project_by_id")
    public Map delete_project_by_id(@RequestBody Map request){
        int id = Integer.parseInt((String) request.get("id"));
        int res = projectServiceImpl.delete_project_by_id(id);
        Map map = new HashMap();
        map.put("isOK", res == 1);
        map.put("msg", res == 1 ? "添加成功" : "添加失败");
        return map;
    }
    @RequestMapping("/delete_project_by_ids")
    public Map delete_project_by_ids(@RequestBody Map request){
        List<Integer> IDS = (List<Integer>) request.get("ids");
        int[] ids = new int[IDS.size()];
        for (int i = 0; i < IDS.size(); i++) {
            ids[i] = IDS.get(i);
        }
        int res = projectServiceImpl.delete_project_by_ids(ids);
        Map map = new HashMap();
        map.put("isOK", res == ids.length);
        map.put("msg", res == ids.length ? "添加成功" : "添加失败");
        return map;
    }

    @RequestMapping("/update_project")
    public Map update_project(Project project){ // project 需要使用 Map, request.get("xxx"), 然后手动创建一个project
        int res = projectServiceImpl.update_project(project);
        Map map = new HashMap();
        map.put("isOK", res == 1);
        map.put("msg", res == 1 ? "添加成功" : "添加失败");
        return map;
    }

    @RequestMapping("/select_all_projects")
    public Map select_all_projects(){
        List<Project> projects = projectServiceImpl.select_all_projects();
        Map map = new HashMap();
        map.put("isOK", projects.size() > 0);
        map.put("msg",  projects.size() > 0 ? "查询成功" : "查询失败");
        map.put("projects", projects);
        return map;
    }
//    @RequestMapping("/select_project_by_id")
//    public Project select_project_by_id(@Param("id") int id){
//        return projectServiceImpl.select_project_by_id(id);
//    }
//    @RequestMapping("/select_project_by_name")
//    public Project select_project_by_name(@Param("name") String name){
//        return projectServiceImpl.select_project_by_name(name);
//    }
//    @RequestMapping("/select_projects_by_tenant_id")
//    public List<Project> select_projects_by_tenant_id(@Param("tenant_id") int id){
//        return projectServiceImpl.select_projects_by_tenant_id(id);
//    }
}
