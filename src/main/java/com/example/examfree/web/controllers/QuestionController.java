package com.example.examfree.web.controllers;

import com.example.examfree.model.ExamComp;
import com.example.examfree.model.ExamDao;
import com.example.examfree.model.Question;
import com.example.examfree.model.QuestionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    QuestionDao questionDao;
    @Autowired
    ExamDao examDao;
    @RequestMapping(method = RequestMethod.GET)
    public List<Question> getAllQuestions(){
        return questionDao.findAll();
    }
    @RequestMapping(method=RequestMethod.POST)
    public Question create(@RequestBody Question contact) {
        return questionDao.save(contact);
    }
    @RequestMapping(value = "/examscomp", method = RequestMethod.GET)
    ExamComp getCompleteExam(@RequestParam("id") String id){
        final Random random = new Random();
        ArrayList<Question> questions = new ArrayList<>();
        ArrayList<Question> questionsTemp = new ArrayList<>();
        ExamComp examComp = new ExamComp();
       Map<String , Integer> ex = examDao.findByExamId(id).getQuestions();
        for (Map.Entry<String, Integer> entry : ex.entrySet())
        {
            questionsTemp=questionDao.findAllByDiscipline(entry.getKey());
            Collections.shuffle(questionsTemp);
            examComp.setExamId(Integer.parseInt(id));
            if (questionsTemp.size()>=entry.getValue()){
                for (int i = 0; i < entry.getValue(); i++) {
                    Question qt = questionsTemp.get(i);
                    questions.add(qt);
                }
                examComp.setQuestions(questions);
            }
            else {
                System.out.println("The question quantity exceeds stored questions");
                return null;
            }

        }
        examComp.setDiscipline(examDao.findByExamId(id).getMainDiscipline());
        return examComp;
    }

}
