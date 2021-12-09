package com.company;

public class OurFileReader {
    public void populateStorage() {
        Storage.getInstance().addTask("cement");
        Storage.getInstance().addTask("drywall");
    }
}
