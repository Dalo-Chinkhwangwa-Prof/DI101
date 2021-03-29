package com.britishbroadcast.dependencyinjection101.util;

public class ApplicationSingletonJ {


    private static ApplicationSingletonJ instance = null;

    private ApplicationSingletonJ(){}

    public static ApplicationSingletonJ getInstance(){

        if(instance == null)
            instance = new ApplicationSingletonJ();
        return instance;
    }

}
