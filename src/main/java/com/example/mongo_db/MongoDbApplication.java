package com.example.mongo_db;

import com.example.mongo_db.db.Address;
import com.example.mongo_db.db.Student;
import com.example.mongo_db.enums.Gender;
import com.example.mongo_db.repo.StudentRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
public class MongoDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDbApplication.class, args);
    }

    @Bean
    public CommandLineRunner runner(StudentRepo studentRepo){
        return args -> {
            Address address = new Address("Sri Lanka","Wadduwa");
            Student student = new Student(
                    "Dulan",
                    "Herath",
                    "dulan@gmail.com",
                    Gender.MALE,
                    address,
                    List.of("CS","PMAT","PHYS"),
                    LocalDateTime.now()
            );
            studentRepo.insert(student);

        };
    }
}
