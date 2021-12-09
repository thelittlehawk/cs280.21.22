package ba.edu.ssst;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    public void TestToString() {
        Employee e = new Employee("First", "Last", 1000);
        assertEquals("First, Last", e.toString());
    }

    @Test
    public void TestBonus() {
        Employee e = new Employee("First", "Last", 1000);
        assertEquals(1200, e.getBonus());
    }

    @Test
    public void NotTestBonus() {
        Employee e = new Employee("First", "Last", 1000);
        assertNotEquals(1000, e.getBonus());
    }

    @Test
    public void TestArray() {
        Employee e = new Employee("First", "Last", 1000);
        assertArrayEquals(new String[] {}, new ArrayList<String>());
    }
}
