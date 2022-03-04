package com.mongo.example.mongodbexample.controller;

import com.mongo.example.mongodbexample.models.Student;
import com.mongo.example.mongodbexample.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping(path = "/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }

    @RequestMapping(value = "/students", method = RequestMethod.POST)
    public void addStudent(@RequestBody Student student){
        studentService.addStudent(student);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.PUT)
    public void updateStduent(@RequestBody Student student, @PathVariable int id){
        studentService.updateStudent(student, id);
    }

    @RequestMapping(value = "/students/{id}/name", method = RequestMethod.PUT)
    public void updateStudentByName(@RequestBody String name, @PathVariable int id){
        studentService.updateStudentByName(name, id);
    }

    @RequestMapping(value = "/students/{id}", method = RequestMethod.DELETE)
    public void deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
    }
}
