package com.singleton;

public class LazyIntialization {
    private static LazyIntialization instance;

    private LazyIntialization(){

    }
    public static LazyIntialization getInstance(){

        if(instance==null){
            instance = new LazyIntialization();
        }
        return instance;
    }
}
