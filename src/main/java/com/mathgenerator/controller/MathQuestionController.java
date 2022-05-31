package com.mathgenerator.controller;
import com.mathgenerator.module.MathQuestion;
import com.mathgenerator.view.MathQuestionListView;
import io.dropwizard.views.View;
import java.util.*;
import javax.ws.rs.*;

@Path("/questionList")
public class MathQuestionController {
    @GET
    public View get(){
        String[]ops={"+","-","*","/"};
        List<MathQuestion> mathQuestionList=new ArrayList<>();
        for(int i=0;i<10;i++){
            int temp=(int)(Math.random()*4);
            int first=(int) (Math.random() * 100 + 1);
            int second=(int) (Math.random() * 100 + 1);
            if(temp!=3) {
                mathQuestionList.add(new MathQuestion(i+1, first, second, ops[temp]));
            }else{
                while(first%second!=0){
                    second=(int) (Math.random() * 100 + 1);
                }
            }
            mathQuestionList.add(new MathQuestion(i+1, first, second, ops[temp]));
        }

        return new MathQuestionListView("/views/mathQuestionList.mustache",  mathQuestionList);
    }



}
