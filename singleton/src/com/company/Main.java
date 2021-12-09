package com.company;

import java.io.FileReader;
import java.security.Signature;

public class Main {

    public static void main(String[] args) {
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());

        OurFileReader fr = new OurFileReader();
        fr.populateStorage();

        Report r = new Report();
        r.generate();

        ConsoleWriter cw = new ConsoleWriter();
        cw.write();
    }
}
