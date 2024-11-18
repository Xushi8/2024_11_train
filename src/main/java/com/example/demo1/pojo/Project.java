package com.example.demo1.pojo;

import java.time.LocalDate;

public class Project {
    private Integer project_id;
    private Integer tenant_id;
    private String project_name;
    private LocalDate received_date;
    private LocalDate evaluation_start_date;
    private LocalDate evaluation_end_date;
    private String project_overview;
    private String team_location;
    private String valuer;
    private String reviewer;
    private String tech_reviewer;
    private String approver;
    private Integer state;
    private String type;
    private String version;
    private Integer quantity;

    @Override
    public String toString() {
        return "Projects{" +
                "project_id=" + project_id +
                ", tenant_id=" + tenant_id +
                ", project_name='" + project_name + '\'' +
                ", received_date=" + received_date +
                ", evaluation_start_date=" + evaluation_start_date +
                ", evaluation_end_date=" + evaluation_end_date +
                ", project_overview='" + project_overview + '\'' +
                ", team_location='" + team_location + '\'' +
                ", valuer='" + valuer + '\'' +
                ", reviewer='" + reviewer + '\'' +
                ", tech_reviewer='" + tech_reviewer + '\'' +
                ", approver='" + approver + '\'' +
                ", state=" + state +
                ", type='" + type + '\'' +
                ", version='" + version + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public Integer getProject_id() {
        return project_id;
    }

    public void setProject_id(Integer project_id) {
        this.project_id = project_id;
    }

    public Integer getTenant_id() {
        return tenant_id;
    }

    public void setTenant_id(Integer tenant_id) {
        this.tenant_id = tenant_id;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public LocalDate getReceived_date() {
        return received_date;
    }

    public void setReceived_date(LocalDate received_date) {
        this.received_date = received_date;
    }

    public LocalDate getEvaluation_start_date() {
        return evaluation_start_date;
    }

    public void setEvaluation_start_date(LocalDate evaluation_start_date) {
        this.evaluation_start_date = evaluation_start_date;
    }

    public LocalDate getEvaluation_end_date() {
        return evaluation_end_date;
    }

    public void setEvaluation_end_date(LocalDate evaluation_end_date) {
        this.evaluation_end_date = evaluation_end_date;
    }

    public String getProject_overview() {
        return project_overview;
    }

    public void setProject_overview(String project_overview) {
        this.project_overview = project_overview;
    }

    public String getTeam_location() {
        return team_location;
    }

    public void setTeam_location(String team_location) {
        this.team_location = team_location;
    }

    public String getValuer() {
        return valuer;
    }

    public void setValuer(String valuer) {
        this.valuer = valuer;
    }

    public String getReviewer() {
        return reviewer;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public String getTech_reviewer() {
        return tech_reviewer;
    }

    public void setTech_reviewer(String tech_reviewer) {
        this.tech_reviewer = tech_reviewer;
    }

    public String getApprover() {
        return approver;
    }

    public void setApprover(String approver) {
        this.approver = approver;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
