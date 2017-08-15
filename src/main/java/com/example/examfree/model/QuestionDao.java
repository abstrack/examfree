package com.example.examfree.model;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.ArrayList;

public interface QuestionDao extends MongoRepository<Question, String  > {
    ArrayList<Question> findAllByDiscipline(String discipline);
}
