import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Exercise 4: Arrange-Act-Assert (AAA) Pattern
public class CalculatorAAATest {

    @Test
    public void testSubtract_AAA() {
        // Arrange: set up inputs and objects
        Calculator calculator = new Calculator();
        int a = 8;
        int b = 3;

        // Act: perform the action
        int result = calculator.subtract(a, b);

        // Assert: check the result
        assertEquals(5, result, "8 - 3 should be 5");
    }
}
