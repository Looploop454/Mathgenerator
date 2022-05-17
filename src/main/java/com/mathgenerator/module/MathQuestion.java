package com.mathgenerator.module;

import com.mathgenerator.view.MathQuestionListView;

public class MathQuestion {
    private int num1;
    private int num2;
    private String operator;

    public MathQuestion(int num1, int num2, String operator){
        this.num1=num1;
        this.num2=num2;
        this.operator=operator;
    }

    public int getNum1(){
        return num1;
    }

    public int getNum2(){
        return num2;
    }
    public String getOperator(){
        return operator;
    }

}
