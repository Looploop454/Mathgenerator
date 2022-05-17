package com.mathgenerator;
import java.util.*;
import com.mathgenerator.controller.*;
import io.dropwizard.*;
import io.dropwizard.setup.*;
import io.dropwizard.views.*;

public class Main extends Application<ApplicationConfiguration> {

    public static void main(String[]args) throws Exception {
        new Main().run(args);
    }

    @Override
    public void run(ApplicationConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new LoginController());
        environment.jersey().register(new GuessGameController());
        environment.jersey().register(new MathQuestionController());
    }

    @Override
    public void initialize(Bootstrap<ApplicationConfiguration> bootstrap){
        bootstrap.addBundle(new ViewBundle<ApplicationConfiguration>(){
            @Override
            public Map<String, Map<String,String>> getViewConfiguration(ApplicationConfiguration configuration){
                return configuration.getViewRendererConfiguration();
            }
        });
    }



}
