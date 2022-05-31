package com.mathgenerator;
import java.util.*;
import com.mathgenerator.controller.*;
import com.mathgenerator.module.User;
import io.dropwizard.*;
import io.dropwizard.db.PooledDataSourceFactory;
import io.dropwizard.hibernate.HibernateBundle;
import io.dropwizard.setup.*;
import io.dropwizard.views.*;

public class Main extends Application<ApplicationConfiguration> {
    private final HibernateBundle<ApplicationConfiguration> hibernateBundle=new HibernateBundle<ApplicationConfiguration>(User.class) {
        @Override
        public PooledDataSourceFactory getDataSourceFactory(ApplicationConfiguration configuration) {
            return configuration.getDataSourceFactory();
        }
    };

    public static void main(String[]args) throws Exception {
        new Main().run(args);
    }

    @Override
    public void run(ApplicationConfiguration configuration, Environment environment) throws Exception {
        environment.jersey().register(new LoginController());
        environment.jersey().register(new GuessGameController());
        environment.jersey().register(new MathQuestionController());
        environment.jersey().register(new QuestionGradeController());
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
