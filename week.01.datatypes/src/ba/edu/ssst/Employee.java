package ba.edu.ssst;

public class Employee extends Person {
    private int salary;

    public Employee(String firstName, String lastName, int salary) {
        super(firstName, lastName);
        this.salary = salary;
    }

    public int getYearlySalary() {
        return this.salary * 12;
    }

    @Override
    public String toString() {
        return super.toString() + " | Yearly Salary: " + this.getYearlySalary();
    }
}
