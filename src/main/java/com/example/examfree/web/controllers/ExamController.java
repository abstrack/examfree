package com.example.examfree.web.controllers;

import com.example.examfree.model.Exam;
import com.example.examfree.model.ExamDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/exams")
public class ExamController {
    @Autowired
    ExamDao examDao;
    @RequestMapping(method = RequestMethod.GET)
    List<Exam> getAllExams()
    {
    List<Exam> a = new ArrayList<>();
    a=examDao.findAll();
    System.out.println(a);
    return a;
    }
    }