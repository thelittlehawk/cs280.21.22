package com.company;

public class Employee implements ICreateFromString, Comparable<Employee> {
    private String firstName;
    private String lastName;
    private int salary;

    public Employee() {
        this.firstName = "";
        this.lastName = "";
        this.salary = 0;
    }

    public Employee(String[] elements) {
        this.firstName = elements[0];
        this.lastName = elements[1];

        int tempSalary = 0;
        try {
            tempSalary = Integer.parseInt(elements[2].strip());
        } catch (Exception e) {
            tempSalary = -1;
        }

        this.salary = tempSalary;
    }

    public Employee(String line) {
        String[] elements = line.split(",");
        this.firstName = elements[0];
        this.lastName = elements[1];
        this.salary = Integer.parseInt(elements[2]);
    }

    @Override
    public void createFromStrings(String[] elements) {
        this.firstName = elements[0];
        this.lastName = elements[1];
        this.salary = Integer.parseInt(elements[2]);
    }

    @Override
    public int compareTo(Employee o) {
        return 1;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
