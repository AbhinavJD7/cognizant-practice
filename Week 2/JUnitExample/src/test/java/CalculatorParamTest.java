import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;

// Exercise 4: Parameterized Tests
public class CalculatorParamTest {

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "5, 5, 10",
        "0, 0, 0",
        "-2, 3, 1"
    })
    void testAddParameterized(int a, int b, int expected) {
        Calculator calculator = new Calculator();
        assertEquals(expected, calculator.add(a, b), () -> a + " + " + b + " should be " + expected);
    }
}
