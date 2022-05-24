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

        List<MathQuestion> mathQuestionList=new ArrayList<>();
        for(int i=3;i<10;i++){
            mathQuestionList.add(new MathQuestion(i,i,i+5,"+"));
        }

        return new MathQuestionListView("/views/mathQuestionList.mustache",  mathQuestionList);
    }



}
