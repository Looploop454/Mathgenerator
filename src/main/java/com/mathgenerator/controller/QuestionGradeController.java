package com.mathgenerator.controller;
import javax.ws.rs.*;
import javax.ws.rs.core.MultivaluedMap;
import java.util.ArrayList;
import java.util.HashMap;
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

    public int gradeQuestion(MultivaluedMap<String,String>formParams){

  //      System.out.println(formParams);
        int score=0;
        Map<String,String>keys=new HashMap<String,String>();
        for(Map.Entry<String, List<String>>entry:formParams.entrySet()){
            keys.put(entry.getKey(),entry.getValue().get(0));
        }
        System.out.println(keys);
        for(int i=0;i<10;i++){
            String num="num1_"+(i+1);
            System.out.print(num);
            String key="num2_"+(i+1);
            String ans="answer_"+(i+1);
            String ops="opt_"+(i+1);
            String sign=keys.get(ops);
            if(keys.get(ans).equals("")){
                continue;
            }
            if(sign.equals("+") && Integer.parseInt(keys.get(num))+Integer.parseInt(keys.get(key))==Integer.parseInt(keys.get(ans))){
                score++;
            }else if(sign.equals("-") && Integer.parseInt(keys.get(num))-Integer.parseInt(keys.get(key))==Integer.parseInt(keys.get(ans))){
                score++;
            }else if(sign.equals("*") && Integer.parseInt(keys.get(num))*Integer.parseInt(keys.get(key))==Integer.parseInt(keys.get(ans))){
                score++;
            }else if(sign.equals("/") && Integer.parseInt(keys.get(num))/Integer.parseInt(keys.get(key))==Integer.parseInt(keys.get(ans))){
                score++;
            }
        }
    return score;

    }







}
