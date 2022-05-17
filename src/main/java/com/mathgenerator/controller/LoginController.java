package com.mathgenerator.controller;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
@Path("/login")
public class LoginController {
    @GET

    @Produces(MediaType.TEXT_HTML)
    public String login(){
        return "<html>"  +
                "<body> "+
                "<form> <input type='text'>"+
                "<input type='submit' value='submit'>"+
                "</form>"+
                "</body>"+
                "</html>";
    }

    @GET
    @Path("/greeting")
    public String greeting(){
        return "<b>greeting</b>";
    }
}
