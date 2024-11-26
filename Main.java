import java.util.List;

public class Main {
    public static void main(String[] args) {
        FactorialCalculator calculator = new FactorialCalculator();
        int n = 10; // Пример входного числа

        try {
            List<java.math.BigInteger> factorials = calculator.calculateFactorials(n);
            System.out.println("First " + n + " factorials: " + factorials);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Unexpected error occurred: " + e.getMessage());
        }
    }
}