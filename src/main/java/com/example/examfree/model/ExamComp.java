package com.example.examfree.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class ExamComp {
Integer examId;
String discipline;
public ArrayList<Question> questions;
}
