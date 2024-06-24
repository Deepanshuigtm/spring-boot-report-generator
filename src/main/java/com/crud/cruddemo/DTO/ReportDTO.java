package com.crud.cruddemo.DTO;

import com.crud.cruddemo.Entity.HealthCondition;
import com.crud.cruddemo.Entity.User;
import jakarta.persistence.*;

import java.sql.Timestamp;

public class ReportDTO {

    private Long report_id; // Primary Key

    private Long generated_at;

    private String condition_summary;

//    @OneToOne(mappedBy = "report", cascade = CascadeType.ALL, orphanRemoval = true)
    private HealthCondition health;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
    private User user;

    public ReportDTO() {
    }

    public ReportDTO(Long report_id, Long generated_at, String condition_summary, HealthCondition health, User user) {
        this.report_id = report_id;
        this.generated_at = generated_at;
        this.condition_summary = condition_summary;
        this.health = health;
        this.user = user;
    }

    public HealthCondition getHealth() {
        return health;
    }

    public void setHealth(HealthCondition health) {
        this.health = health;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getReport_id() {
        return report_id;
    }

    public void setReport_id(Long report_id) {
        this.report_id = report_id;
    }

    public Long getGenerated_at() {
        return generated_at;
    }

    public void setGenerated_at(Long generated_at) {
        this.generated_at = generated_at;
    }

    public String getCondition_summary() {
        return condition_summary;
    }

    public void setCondition_summary(String condition_summary) {
        this.condition_summary = condition_summary;
    }

    @Override
    public String toString() {
        return "Report{" +
                "report_id=" + report_id +
                ", generated_at=" + generated_at +
                ", condition_summary='" + condition_summary + '\'' +
                '}';
    }
}
