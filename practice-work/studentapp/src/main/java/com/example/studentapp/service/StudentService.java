package com.example.studentapp.service;

import com.example.studentapp.model.Student;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    public List<Student> getStudents() {
        return List.of(
                new Student(1, "John"),
                new Student(2, "Ravi"),
                new Student(3, "Priya")
        );
    }
}

