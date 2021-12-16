package ba.edu.ssst;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Department {
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name, ArrayList<Employee> employees) {
        this.name = name;
        this.employees = employees;
    }

    public String getName() {
        return this.name;
    }

    public ArrayList<Employee> getEmployees() {
        return this.employees;
    }

    public Employee employeeWithHighestSalary() {
        Employee maxSalary = this.employees.get(0);
        for (Employee e:this.employees) {
            if(maxSalary.getSalary() < e.getSalary())
                maxSalary = e;
        }
        return maxSalary;
    }

    public Employee employeeWithLowestSalary() {
        Employee minSalary = this.employees.get(0);
        for (Employee e:this.employees) {
            if(minSalary.getSalary() > e.getSalary())
                minSalary = e;
        }
        return minSalary;
    }

    public double averageSalary() {
        return this.totalSalaries() / this.employees.size();
    }

    public int newEmployees() {
        return (int) ((20000 - this.totalSalaries())/this.averageSalary());
    }

    private int totalSalaries() {
        int sum = 0;
        for (Employee e:this.employees) {
            sum += e.getSalary();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return Objects.equals(name, that.name) && Objects.equals(employees, that.employees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, employees);
    }
}
