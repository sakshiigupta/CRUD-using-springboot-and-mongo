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

    //Read method
    public List<Student> getAllStudents() {
        List<Student> students = studentRepository.findAll();
        return students;
    }

    //Create and add method
    public void addStudent(Student student) {
        studentRepository.save(student);
    }

    //Update  method
    public void updateStudent(Student student, int id) {
        Optional<Student> oldStudent = studentRepository.findById(id);
        if(oldStudent.isPresent()){
                studentRepository.save(student);
        }

    }

    //Delete Method
    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }



}
