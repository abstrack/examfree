package com.example.examfree;

import com.example.examfree.model.Exam;
import com.example.examfree.model.ExamDao;
import com.example.examfree.model.Question;
import com.example.examfree.model.QuestionDao;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamfreeApplication {
@Autowired
private QuestionDao qd;
@Autowired
private ExamDao exd;
	public static void main(String[] args) {

		SpringApplication.run(ExamfreeApplication.class, args);

	}
	@PostConstruct
	void initDb(){

		ObjectMapper mapper = new ObjectMapper();
		Set<String> set = new HashSet<>() ;
		set.add("Answ1");
		set.add("Answ2");
		set.add("Answ3");
		set.add("Answ4");
		Question q2= new Question("1", "java", "Quest2", set, "Answ1");
		Question q3= new Question("2", "java", "Quest3", set, "Answ1");
		Question q5= new Question("4", "c", "Quest4", set, "Answ1");
		Question q6= new Question("5", "c", "Quest5", set, "Answ1");
		Question q= new Question("3", "java", "Quest1", set, "Answ1");
		qd.save(q);
		qd.save(q2);
		qd.save(q3);
		qd.save(q5);
		qd.save(q6);
		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("java", 2);
		hm.put("c", 1);
		HashMap<String, Integer> hm2 = new HashMap<>();
		hm2.put("java", 3);
		hm2.put("c", 2);
		Exam ex = new Exam("1","programming",hm);
		Exam ex1 = new Exam("2","programming", hm2);
		exd.save(ex);
		exd.save(ex1);
	}
}
