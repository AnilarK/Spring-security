package com.security.demo.controller;

import com.security.demo.model.Student;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    private List<Student> student = new ArrayList<>(List.of(
            new Student(1,"Abhay",55),
            new Student(2,"abhinav",75)
    ));

    @GetMapping("/csrf-token")
    public CsrfToken getCsrfToken(HttpServletRequest req){
        return (CsrfToken) req.getAttribute("_csrf");
    }

    @GetMapping("/students")
    public List<Student> addStudent(){
        return student;
    }

    @PostMapping("/students")
    public Student addStudent(@RequestBody Student stud){
        student.add(stud);
        return stud;

    }
}
