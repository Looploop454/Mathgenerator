package com.mathgenerator.controller;
import javax.ws.rs.*;
@Path("/grade")

public class QuestionGradeController {
    @POST
    @Consumes("application/x-www-form-urlencoded")
    public void gradeQuestion(@FormParam("answer") int answer,
                              @FormParam("num1") int num1,
                              @FormParam("num2") int num2,
                              @FormParam("opt") String opt){
        System.out.println(num1+opt+num2+answer);
    }
}
