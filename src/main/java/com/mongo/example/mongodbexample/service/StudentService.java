package com.mongo.example.mongodbexample.service;

import com.mongo.example.mongodbexample.models.Student;
import com.mongo.example.mongodbexample.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void updateStudent(Student student, int id) {
        Optional<Student> oldStudent = studentRepository.findById(id);
        if(oldStudent.isPresent()){
                studentRepository.save(student);
        }

    }
}
