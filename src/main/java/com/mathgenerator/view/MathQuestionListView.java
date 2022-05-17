package com.mathgenerator.view;
import com.mathgenerator.module.MathQuestion;
import io.dropwizard.views.View;
import java.util.*;
public class MathQuestionListView extends View{
    private List<MathQuestion> mathQuestionList;
    public MathQuestionListView(String templateName, List<MathQuestion> mathQuestionList){
        super(templateName);
        this.mathQuestionList= mathQuestionList;
    }


    public List<MathQuestion> getQuestionList(){
        return mathQuestionList;
    }
}
