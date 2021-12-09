package com.company;

public class ConsoleWriter {
    public void write() {
        for (String task: Storage.getInstance().getTasks()) {
            System.out.println(task);
        }
    }
}
