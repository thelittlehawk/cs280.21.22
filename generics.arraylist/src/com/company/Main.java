package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        String[] linesEmp = new String[] {
                "First 1, Last, 1000",
                "First 2, Last, 2000",
        };

        String[] linesStu = new String[] {
                "First 1, Last, 2 godina",
                "First 2, Last, 3 godina",
        };

        OurFileReader<Employee> reader1 = new OurFileReader(linesEmp, Employee.class);
        ArrayList<Employee> employees = reader1.process();
        System.out.println(employees);

        OurFileReader<Student> reader2 = new OurFileReader(linesStu, Student.class);
        ArrayList<Student> students = reader2.process();
        System.out.println(employees);
    }
}
