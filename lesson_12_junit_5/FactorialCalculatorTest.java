package lesson_12_junit_5;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {
    @Test
    void testFactorialOfZero() {
        assertEquals(1, Main.factorial(0), "Factorial of 0 should be 1");
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, Main.factorial(5), "Factorial of 5 should be 120");
    }

    @Test
    void testFactorialOfOne() {
        assertEquals(1, Main.factorial(1), "Factorial of 1 should be 1");
    }

    @Test
    void testFactorialOfNegativeNumber() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Main.factorial(-1);
        });
        assertEquals("Number must be non-negative.", exception.getMessage());
    }
}
