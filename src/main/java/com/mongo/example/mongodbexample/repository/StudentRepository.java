package com.mongo.example.mongodbexample.repository;

import com.mongo.example.mongodbexample.models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepository extends MongoRepository<Student, Integer> {

}
