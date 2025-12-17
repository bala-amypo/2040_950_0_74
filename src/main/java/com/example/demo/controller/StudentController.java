package com.example.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.project.entity.Student;
import com.example.project.service.Studentservice;

@RestController
public class StudentController {

    @Autowired
    private Studentservice ser;

    @PostMapping("/postStudent")
    public Student addStudent(@RequestBody Student var) {
        return ser.saveData(var);
    }
}