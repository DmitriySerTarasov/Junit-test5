import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    private final Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        Assertions.assertEquals(3, calculator.add(1, 2));
        Assertions.assertEquals(0, calculator.add(0, 0));
        Assertions.assertEquals(-1, calculator.add(1, -2));
    }

    @Test
    public void testSubtraction() {
        Assertions.assertEquals(-1, calculator.subtract(1, 2));
        Assertions.assertEquals(0, calculator.subtract(2, 2));
        Assertions.assertEquals(3, calculator.subtract(1, -2));
    }

    @Test
    public void testMultiplication() {
        Assertions.assertEquals(2, calculator.multiply(1, 2));
        Assertions.assertEquals(0, calculator.multiply(0, 5));
        Assertions.assertEquals(-2, calculator.multiply(1, -2));
    }

    @Test
    public void testDivision() {
        Assertions.assertEquals(0.5, calculator.divide(1, 2));
        Assertions.assertEquals(1, calculator.divide(2, 2));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.divide(1, 0));
    }
}