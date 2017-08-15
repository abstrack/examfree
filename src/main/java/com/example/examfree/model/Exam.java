package com.example.examfree.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.annotation.Id;

import java.util.Map;
@Data
@Document(collection = "exam")
@AllArgsConstructor
@RepositoryRestResource(collectionResourceRel = "exams", path = "exams", exported = true)

public class Exam {
    @Id
    private String examId;
    private String mainDiscipline;
    private Map<String, Integer> questions;
}
