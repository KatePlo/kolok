import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class FactorialCalculator {
    private static final Logger LOGGER = Logger.getLogger(FactorialCalculator.class.getName());

    /**
     * Метод для вычисления первых n факториалов.
     * @param n натуральное число
     * @return список факториалов от 1 до n
     * @throws IllegalArgumentException если n <= 0
     */
    public List<BigInteger> calculateFactorials(int n) {
        if (n <= 0) {
            LOGGER.severe("Input must be a positive integer. Received: " + n);
            throw new IllegalArgumentException("Input must be a positive integer.");
        }

        List<BigInteger> factorials = new ArrayList<>();
        BigInteger currentFactorial = BigInteger.ONE;

        for (int i = 1; i <= n; i++) {
            factorials.add(currentFactorial);
            LOGGER.info("Factorial of " + i + " = " + currentFactorial);
            currentFactorial = currentFactorial.multiply(BigInteger.valueOf(i + 1));
        }

        return factorials;
    }
}