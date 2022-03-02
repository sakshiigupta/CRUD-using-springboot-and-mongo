package com.mongo.example.mongodbexample.service;

import com.mongo.example.mongodbexample.models.Student;
import com.mongo.example.mongodbexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
