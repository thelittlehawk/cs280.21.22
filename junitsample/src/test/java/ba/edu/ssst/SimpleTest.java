package ba.edu.ssst;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTest {
    @Test
    public void TestNumbers() {
        assertEquals(1, 1);
    }

    @Test
    public void FailedTestNumbers() {
        assertEquals(1, 2);
    }
}
