package ba.edu.ssst;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        IContract empContract = new Employee("Ime", "Prezime", 2019);
        IContract custContract = new Customer("Kupac A", 2017);

        System.out.println("Employee contract length: " + empContract.length());
        System.out.println("Customer contract length: " + custContract.length());

        ArrayList<IContract> contracts = new ArrayList<>();
        contracts.add(empContract);
        contracts.add(custContract);
        System.out.println("========================");
        System.out.println("========================");

        for (IContract contract: contracts) {
            if(contract.getClass() == Employee.class) {
                System.out.print(
                        ((Employee) contract).getFirstName() +
                        " " +
                                ((Employee) contract).getLastName()
                );
            }
            System.out.println(" " + contract.length());
            System.out.println("========================");
        }

        for (IContract contract: contracts) {
            System.out.print(
                    ((Employee) contract).getFirstName() + " " + ((Employee) contract).getLastName());
            System.out.println(" " + contract.length());
            System.out.println("========================");
        }
    }
}
