package com.example.demo;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentContoller {

     List<Student> students = new ArrayList<>(List.of(
            new Student(1,"Abhay",22,34),
            new Student(2,"Abhinav",23,47),
            new Student(3,"Abhishek",19,67) )
     );

     @GetMapping("/student")
     public List<Student> getStudents() {
         return students;
     }

     @PostMapping("/student")
     public Student addStudent(@RequestBody Student student) {
         students.add(student);
         return student;
     }

     @GetMapping("/csrf")
     public CsrfToken csrf(HttpServletRequest request) {
         return (CsrfToken)request.getAttribute("_csrf");
     }
}
