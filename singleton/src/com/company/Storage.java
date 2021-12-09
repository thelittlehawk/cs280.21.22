package com.company;

import java.util.ArrayList;

public class Storage {

    private static Storage _instance;

    private static ArrayList<String> tasks;

    private Storage() {
        super();
        this.tasks = new ArrayList<>();
        System.out.println("Constructor");
    }

    public static Storage getInstance() {
        if(_instance == null) {
            _instance = new Storage();
        }
        return _instance;
    }

    public void addTask(String task) {
        this.tasks.add(task);
    }

    public void removeTask(String task) {
        this.tasks.remove(task);
    }

    public ArrayList<String> getTasks() {
        return (ArrayList<String>) this.tasks.clone();
    }
}
