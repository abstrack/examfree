package com.example.examfree.model;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface ExamDao extends MongoRepository<Exam, String > {
    Exam findByExamId(@Param("examId") String examId);
}
