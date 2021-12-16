package ba.edu.ssst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class DepartmentTest {
    @Test
    public void CreateDepartment1() {
        Department department = new Department("Marketing", new ArrayList<Employee>());
        assertEquals("Marketing", department.getName());
        assertArrayEquals(new ArrayList<Employee>().toArray(), department.getEmployees().toArray());
    }

    @Test
    public void CreateDepartment2() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Frist", "Last", 100));

        Department department = new Department("Marketing", employees);

        assertEquals("Marketing", department.getName());
        assertArrayEquals(employees.toArray(), department.getEmployees().toArray());
    }

    @Test
    public void HighestSalary() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("First 1", "Last", 100));
        employees.add(new Employee("First 2", "Last", 200));
        employees.add(new Employee("First 3", "Last", 500));

        Department department = new Department("Marketing", employees);

        assertEquals(500, department.employeeWithHighestSalary().getSalary());
        assertEquals("First 3, Last", department.employeeWithHighestSalary().getFullName());
    }

    @Test
    public void LowestSalary() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("First 1", "Last", 100));
        employees.add(new Employee("First 2", "Last", 200));
        employees.add(new Employee("First 3", "Last", 500));

        Department department = new Department("Marketing", employees);

        assertEquals(100, department.employeeWithLowestSalary().getSalary());
        assertEquals("First 1, Last", department.employeeWithLowestSalary().getFullName());
    }

    @Test
    public void AverageSalary() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("First 1", "Last", 100));
        employees.add(new Employee("First 2", "Last", 200));
        employees.add(new Employee("First 3", "Last", 400));
        employees.add(new Employee("First 4", "Last", 500));

        Department department = new Department("Marketing", employees);

        assertEquals(300, department.averageSalary());
    }

    @Test
    public void NewEmployeesCount1() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("First 1", "Last", 1000));
        employees.add(new Employee("First 2", "Last", 2000));
        employees.add(new Employee("First 3", "Last", 4000));
        employees.add(new Employee("First 4", "Last", 5000));
        // Total: 12 000

        Department department = new Department("Marketing", employees);

        assertEquals(3000, department.averageSalary());
        assertEquals(2, department.newEmployees());
    }

    @Test
    public void NewEmployeesCount2() {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("First 1", "Last", 1000));
        employees.add(new Employee("First 2", "Last", 2000));
        employees.add(new Employee("First 3", "Last", 4000));
        employees.add(new Employee("First 4", "Last", 5000));
        // Total: 12 000

        Department department = new Department("Marketing", employees);

        assertEquals(3000, department.averageSalary());
        assertEquals(2, department.newEmployees());
    }
}
