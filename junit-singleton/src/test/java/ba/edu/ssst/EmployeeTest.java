package ba.edu.ssst;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void CreateEmployee1() {
        Employee e = new Employee("First", "Last", 1000);
        assertEquals("First", e.getFirstName());
        assertEquals("Last", e.getLastName());
        assertEquals(1000, e.getSalary());
        assertEquals("First, Last", e.getFullName());
    }

    @Test
    public void CreateEmployee2() {
        Employee e = new Employee("New First", "New Last", 1000);
        assertEquals("New First", e.getFirstName());
        assertEquals("New Last", e.getLastName());
        assertEquals(1000, e.getSalary());
    }

    @Test
    public void CreateEmployee3() {
        Employee e = new Employee("New First", "New Last", 1000);
        assertEquals(e.getFirstName(), e.getFirstName());
        assertEquals(e.getLastName(), e.getLastName());
        assertEquals(e.getSalary(), e.getSalary());
    }

    @Test
    public void CreateEmployee4() {
        Employee e = new Employee("New First", "New Last", 1000);
        assertEquals(e.getFullName(), "New First, New Last");
    }
}
