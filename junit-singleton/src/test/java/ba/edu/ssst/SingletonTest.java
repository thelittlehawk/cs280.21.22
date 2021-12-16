package ba.edu.ssst;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class SingletonTest {
    @Test
    public void getInstance() {
        assertArrayEquals(Singleton.getInstance().getDepartments().toArray(), new ArrayList().toArray());
    }

    @Test
    public void getDepartments() {
        ArrayList<Department> departments = new ArrayList<Department>();

        ArrayList<Employee> marketingEmployees = new ArrayList<>();
        marketingEmployees.add(new Employee("MF", "ML", 100));
        departments.add(new Department("Marketing", marketingEmployees));
        departments.add(new Department("Production", new ArrayList<>()));

        ArrayList<Employee> marketingEmployees2 = new ArrayList<>();
        marketingEmployees.add(new Employee("MF", "ML", 100));

        Singleton.getInstance().addDepartment(new Department("Marketing", marketingEmployees2));
        Singleton.getInstance().addDepartment(new Department("Production", new ArrayList<>()));

        assertArrayEquals(Singleton.getInstance().getDepartments().toArray(), departments.toArray());
    }
}
