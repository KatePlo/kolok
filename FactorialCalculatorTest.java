import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FactorialCalculatorTest {

    @Test
    void testCalculateFactorialsValidInput() {
        FactorialCalculator calculator = new FactorialCalculator();
        List<BigInteger> result = calculator.calculateFactorials(5);

        assertEquals(5, result.size());
        assertEquals(BigInteger.ONE, result.get(0)); // 1!
        assertEquals(BigInteger.valueOf(2), result.get(1)); // 2!
        assertEquals(BigInteger.valueOf(6), result.get(2)); // 3!
        assertEquals(BigInteger.valueOf(24), result.get(3)); // 4!
        assertEquals(BigInteger.valueOf(120), result.get(4)); // 5!
    }

    @Test
    void testCalculateFactorialsEdgeCase() {
        FactorialCalculator calculator = new FactorialCalculator();
        List<BigInteger> result = calculator.calculateFactorials(1);

        assertEquals(1, result.size());
        assertEquals(BigInteger.ONE, result.get(0)); // 1!
    }

    @Test
    void testCalculateFactorialsNegativeInput() {
        FactorialCalculator calculator = new FactorialCalculator();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFactorials(-5);
        });

        assertEquals("Input must be a positive integer.", exception.getMessage());
    }

    @Test
    void testCalculateFactorialsZeroInput() {
        FactorialCalculator calculator = new FactorialCalculator();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.calculateFactorials(0);
        });

        assertEquals("Input must be a positive integer.", exception.getMessage());
    }
}
