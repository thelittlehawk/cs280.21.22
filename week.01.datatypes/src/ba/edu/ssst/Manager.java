package ba.edu.ssst;

public class Manager extends Employee {
    public Manager(String firstName, String lastName) {
        super(firstName, lastName, 0);
    }

    public Manager(String firstName, String lastName, int salary) {
        super(firstName, lastName, salary);
    }

    @Override
    public int getYearlySalary() {
        return super.getYearlySalary() + 10000;
    }
}
