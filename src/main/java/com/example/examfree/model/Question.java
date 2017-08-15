package com.example.examfree.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.Set;
@Data
@Document(collection = "question")
@AllArgsConstructor
@RepositoryRestResource(collectionResourceRel = "questions", path = "questions", exported = true)
public class Question {


    @Id
   private String id;
   private String discipline;
   private String question;
   private Set<String> options;
   private String answer;

}
