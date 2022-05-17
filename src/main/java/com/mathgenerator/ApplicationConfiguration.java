package com.mathgenerator;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

import javax.validation.constraints.NotNull;

public class ApplicationConfiguration extends Configuration{

    @NotNull
    private Map<String,Map<String,String>> viewRendererConfiguration=Collections.emptyMap();

    private String name;
    @JsonProperty("viewRendererConfiguration")
    public Map<String,Map<String,String>> getViewRendererConfiguration(){
        return viewRendererConfiguration;
    }


    @JsonProperty("name")
    public String name(){
        return name;
    }
}
