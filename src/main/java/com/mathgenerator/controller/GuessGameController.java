package com.mathgenerator.controller;
import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.GET;
@Path("/guess")
public class GuessGameController {
    @GET
    public String getView(){
        return "<html>"  +
                "<body> "+
                "<form action=/guess method='post'> Hello, please enter your name:"+
                "<input name='name' type='text'>"+
                "<br>"+
                "<form action=/guess method='post'> Please enter you number:"+
                "<input name='number' type='text'>"+
                "<input type='submit' value='submit'>"+
                "</form>"+
                "</body>"+
                "</html>";
    }
    int answer=(int)(Math.random()*100)+1;

    @POST
    public String post(@FormParam("name") String name, @FormParam("number") String guess) {
        int temp = Integer.parseInt(guess);
        if (temp == answer) {
            answer=(int)(Math.random()*100)+1;
            return "Hello " + name + ", your guess was " + temp + ", your guess was correct.  "+
                    "<input type='submit' value='restart' onclick=history.back()>";

        } else if (temp > answer) {
            return "Hello " + name + ", your guess was " + temp + ", your guess was too large."+"<input type='submit' value='retry' onclick=history.back()>";
        }
        return "Hello " + name + ", your guess was " + temp + ", your guess was too small."+"<input type='submit' value='retry' onclick=history.back()>";
    }
}

