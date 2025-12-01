package com.example.studentapp.controller;

import com.example.studentapp.service.StudentService;
import com.example.studentapp.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/students")
    public String studentsPage(Model model) {
        List<Student> students = service.getStudents();
        model.addAttribute("students", students);
        return "students"; // loads students.html
    }
}

