package camt.se234.lab10.service;

import camt.se234.lab10.entity.Grade;
import org.springframework.stereotype.Service;

@Service
public class GradeServiceImpl implements GradeService {
    @Override
    public String getGrade(double score) {
        String grade= "";
        if(score <= 100&&score>=80){
            grade =  "A";
        }else if(score <80 && score>=75){
            grade = "B";
        }else if(score <75 &&score>=60){
            grade =  "C";
        }else if(score <=60 && score>=33){
            grade = "D";
        }else if(score <=32){
            grade = "F";
        }
        return grade;

    }
}
