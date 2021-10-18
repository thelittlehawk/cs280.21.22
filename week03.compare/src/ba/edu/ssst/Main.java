package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ime Prezime 1", 1000));
        employees.add(new Employee("Ime Prezime 4", 600));
        employees.add(new Employee("Ime Prezime 3", 1200));
        employees.add(new Employee("Ime Prezime 2", 1800));

        System.out.println("Prije sortiranja");
        for (Employee e:employees) {
            System.out.println(e);
        }

        Collections.sort(employees);

//        Custom sort
//        employees.sort((e1, e2) -> {
//        });

        System.out.println();
        System.out.println();
        System.out.println("Poslije sortiranja");
        for (Employee e:employees) {
            System.out.println(e);
        }
    }
}
