import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Exercise 3: Assertions in JUnit
public class CalculatorAssertionTest {

    @Test
    public void testAddEquals() {
        Calculator calculator = new Calculator();
        assertEquals(7, calculator.add(3, 4), "3 + 4 should be 7");
    }

    @Test
    public void testAddNotEquals() {
        Calculator calculator = new Calculator();
        assertNotEquals(10, calculator.add(3, 4), "3 + 4 should not be 10");
    }

    @Test
    public void testCalculatorNotNull() {
        Calculator calculator = new Calculator();
        assertNotNull(calculator, "Calculator instance should not be null");
    }

    @Test
    public void testBooleanAssertions() {
        Calculator calculator = new Calculator();
        assertTrue(calculator.add(2, 2) == 4, "2 + 2 should be 4");
        assertFalse(calculator.add(2, 2) == 5, "2 + 2 should not be 5");
    }
}
