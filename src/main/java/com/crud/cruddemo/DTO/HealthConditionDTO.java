package com.crud.cruddemo.DTO;

import com.crud.cruddemo.Entity.Report;
import com.crud.cruddemo.Entity.User;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import java.sql.Timestamp;

public class HealthConditionDTO {

    private Long health_id;

    private Timestamp timestamp;

    private String blood_pressure;

    private String heart_rate;

    private String anxiety_level;

    private String cholesterol_level;

    private String blood_sugar_level;

    private Float weight;

    private Float height;

//    @OneToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "report_id")
    private Report report;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "user_id")
    private User user;


    public HealthConditionDTO() {
    }

    public HealthConditionDTO(Long health_id, Timestamp timestamp, String blood_pressure, String heart_rate, String anxiety_level, String cholesterol_level, String blood_sugar_level, Float weight, Float height, Report report, User user) {
        this.health_id = health_id;
        this.timestamp = timestamp;
        this.blood_pressure = blood_pressure;
        this.heart_rate = heart_rate;
        this.anxiety_level = anxiety_level;
        this.cholesterol_level = cholesterol_level;
        this.blood_sugar_level = blood_sugar_level;
        this.weight = weight;
        this.height = height;
        this.report = report;
        this.user = user;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Long getHealth_id() {
        return health_id;
    }

    public void setHealth_id(Long health_id) {
        this.health_id = health_id;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getBlood_pressure() {
        return blood_pressure;
    }

    public void setBlood_pressure(String blood_pressure) {
        this.blood_pressure = blood_pressure;
    }

    public String getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(String heart_rate) {
        this.heart_rate = heart_rate;
    }

    public String getAnxiety_level() {
        return anxiety_level;
    }

    public void setAnxiety_level(String anxiety_level) {
        this.anxiety_level = anxiety_level;
    }

    public String getCholesterol_level() {
        return cholesterol_level;
    }

    public void setCholesterol_level(String cholesterol_level) {
        this.cholesterol_level = cholesterol_level;
    }

    public String getBlood_sugar_level() {
        return blood_sugar_level;
    }

    public void setBlood_sugar_level(String blood_sugar_level) {
        this.blood_sugar_level = blood_sugar_level;
    }

    public Float getWeight() {
        return weight;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "HealthCondition{" +
                "health_id=" + health_id +
                ", timestamp=" + timestamp +
                ", blood_pressure='" + blood_pressure + '\'' +
                ", heart_rate='" + heart_rate + '\'' +
                ", anxiety_level='" + anxiety_level + '\'' +
                ", cholesterol_level='" + cholesterol_level + '\'' +
                ", blood_sugar_level='" + blood_sugar_level + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
