package com.example.demo1.controller;

import com.example.demo1.pojo.Project;
import com.example.demo1.service.ProjectServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public @RestController
class ProjectController {
    @Autowired
    private ProjectServiceImpl projectServiceImpl;

    @RequestMapping("/insert_project")
    public Map insert_project(@RequestBody  Map<String, Object> request){ // project 需要使用 Map, request.get("xxx"), 然后手动创建一个project
        String name = (String) request.get("name");
        int tenant_id = Integer.parseInt((String) request.get("tenantId"));
        String createDateString = (String) request.get("create_time"); // 提取日期字符串
        LocalDate received_date = LocalDate.parse(createDateString); // 转换为 LocalDate
        String project_overview = (String) request.get("overView");
        String team_location = (String) request.get("location");
        String valuer = (String) request.get("valuer");
        String reviewer = (String) request.get("reviewer");
        String tech_reviewer = (String) request.get("tech_reviewer");
        String approver = (String) request.get("approver");
        int state = 1;



        Project project = new Project( name, tenant_id, received_date, null, null, project_overview, team_location,valuer,reviewer,tech_reviewer,approver,state, null, null, null, null, null);

        int res = projectServiceImpl.insert_project(project);
        Map map = new HashMap();
        map.put("isOK", res == 1);
        map.put("msg", res == 1 ? "添加成功" : "添加失败");
        return map;
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
        map.put("isOk", projects.size() > 0);
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

    @RequestMapping("/select_create_time_by_id")
    public Map select_create_time_by_id(@RequestBody Map request){
        int id = Integer.parseInt((String) request.get("id"));
        LocalDate res = projectServiceImpl.select_create_time_by_id(id);
        Map map = new HashMap();
        map.put("isOK", res != null);
        map.put("msg", res != null ? "查找成功" : "查找失败");
        map.put("createTime", res);
        return map;
    }
    @RequestMapping("/select_create_time_by_ids")
    public Map select_create_time_by_ids(@RequestBody Map request){
        List<Integer> IDS = (List<Integer>) request.get("ids");
        int[] ids = new int[IDS.size()];
        for (int i = 0; i < IDS.size(); i++) {
            ids[i] = IDS.get(i);
        }
        List<LocalDate> res = projectServiceImpl.select_create_time_by_ids(ids);
        Map map = new HashMap();
        map.put("isOK", res != null);
        map.put("msg", res != null ? "查找成功" : "查找失败");
        map.put("createTime", res);
        return map;
    }

    @RequestMapping("/update_startDate_by_projectId")
    public Map update_startDate_by_projectId(@RequestBody Map<String, Object> payload) {
        int id = (int) payload.get("id");
        String startDateString = (String) payload.get("evaluationStartDate"); // 提取日期字符串
        LocalDate startDate = LocalDate.parse(startDateString); // 转换为 LocalDate
        int i = projectServiceImpl.update_startDate_by_projectId(id, startDate);
        Map map = new HashMap();
        map.put("isOk", true);
        map.put("msg", "开始日期修改成功");
        return map;
    }


    @RequestMapping("/update_endDate_by_projectId")
    public Map update_endDate_by_projectId(@RequestBody Map<String, Object> payload) {
        int id = (int) payload.get("id");
        String endDateString = (String) payload.get("evaluationEndDate"); // 提取日期字符串
        LocalDate endDate = LocalDate.parse(endDateString); // 转换为 LocalDate
        int i = projectServiceImpl.update_endDate_by_projectId(id, endDate);
        Map map = new HashMap();
        map.put("isOk", true);
        map.put("msg", "结束日期修改成功");
        return map;
    }

    @RequestMapping("/select_evaluation_amount")
    public Map select_evaluation_amount(){
        // project_id, amount
        List<Map<String, Object>> res =  projectServiceImpl.select_evaluation_amount();
        Map map = new HashMap();
        map.put("isOK", res != null);
        map.put("msg", res != null ? "查询成功" : "查询失败");
        map.put("data", res);
        return map;
    }
}
