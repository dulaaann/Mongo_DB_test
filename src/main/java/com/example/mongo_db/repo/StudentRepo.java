package com.example.mongo_db.repo;

import com.example.mongo_db.db.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface StudentRepo extends MongoRepository<Student,String> {
}
