package com.mongo.example.mongodbexample.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "students")
public class Student {

    private int id;
    private String name;
    private String college;
    private String subject;
    private double cgpa;

    public Student() {}

    public Student(int id, String name, String college, String subject, double cgpa) {
        this.id = id;
        this.name = name;
        this.college = college;
        this.subject = subject;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }
}
