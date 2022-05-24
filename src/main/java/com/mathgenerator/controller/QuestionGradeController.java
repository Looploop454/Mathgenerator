package com.mathgenerator.controller;
import javax.ws.rs.*;
import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Path("/grade")

public class QuestionGradeController {
    @POST
    @Consumes("application/x-www-form-urlencoded")
    /*public void gradeQuestion(@FormParam("answer") int answer,
                              @FormParam("num1") int num1,
                              @FormParam("num2") int num2,
                              @FormParam("opt") String opt){
        System.out.println(num1+opt+num2+answer);
    }*/

    public void gradeQuestion(MultivaluedMap<String,String>formParams){
        //System.out.println(formParams);
        int score=0;
        ArrayList<String>list=new<String>ArrayList();
        for(Map.Entry<String, List<String>>entry:formParams.entrySet()){
            String key=entry.getKey();
            String value=entry.getValue().get(0);
            list.add(key);
            list.add(value);
            /*list.add(value);
            if(Integer.parseInt(list.get(2))+Integer.parseInt(list.get(3))==Integer.parseInt(list.get(1))){
                score++;
            }list.clear();*/
        }//System.out.println(score);

        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }







}
