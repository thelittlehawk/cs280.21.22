package com.company;

public class Report {
    public void generate() {
        Storage.getInstance().addTask("new one");
    }
}
