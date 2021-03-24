package com.example.demo.model;

import javax.persistence.*;

@Entity
@Table(name = "main_1")
public class Main {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String subjectName;
    private String teacher;
    private double startTime;
    private double endTime;

    public Main() {
    }

    public Main(String subjectName, String teacher, double startTime, double endTime) {
        this.id = id;
        this.subjectName = subjectName;
        this.teacher = teacher;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public Long getId() {
        return id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public String getTeacher() {
        return teacher;
    }

    public double getStartTime() { return startTime; }

    public double getEndTime() { return endTime; }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public void setStartTime(double startTime) {
        this.startTime = startTime;
    }

    public void setEndTime(double endTime) {
        this.endTime = endTime;
    }

}
