package com.company;

public class Singleton {

    private static Singleton _instance;

    private Singleton() {
        super();
        System.out.println("Constructor");
    }

    public static Singleton getInstance() {
        if(_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }
}
