package at.campus02.bsd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calc;

    // This method runs before EVERY test to give you a fresh Calculator object
    @BeforeEach
    public void setUp() {
        calc = new Calculator();
    }

    // --- ADDITION TESTS ---
    @Test
    public void testAddPositiveNumbers() {
        assertEquals(8.0, calc.add(5.0, 3.0), "5 + 3 should be 8");
    }

    @Test
    public void testAddNegativeNumbers() {
        assertEquals(-8.0, calc.add(-5.0, -3.0), "-5 + -3 should be -8");
    }

    @Test
    public void testAddWithZero() {
        assertEquals(5.0, calc.add(5.0, 0.0), "5 + 0 should be 5");
    }

    // --- SUBTRACTION TESTS ---
    @Test
    public void testSubtractPositiveNumbers() {
        assertEquals(2.0, calc.subtract(5.0, 3.0), "5 - 3 should be 2");
    }

    @Test
    public void testSubtractResultingInNegative() {
        assertEquals(-5.0, calc.subtract(5.0, 10.0), "5 - 10 should be -5");
    }

    @Test
    public void testSubtractZero() {
        assertEquals(5.0, calc.subtract(5.0, 0.0), "5 - 0 should be 5");
    }

    // --- MULTIPLICATION TESTS ---
    @Test
    public void testMultiplyPositiveNumbers() {
        assertEquals(15.0, calc.multiply(5.0, 3.0), "5 * 3 should be 15");
    }

    @Test
    public void testMultiplyWithNegative() {
        assertEquals(-15.0, calc.multiply(5.0, -3.0), "5 * -3 should be -15");
    }

    @Test
    public void testMultiplyByZero() {
        assertEquals(0.0, calc.multiply(5.0, 0.0), "5 * 0 should be 0");
    }

    // --- DIVISION TESTS ---
    @Test
    public void testDividePositiveNumbers() {
        assertEquals(2.0, calc.divide(10.0, 5.0), "10 / 5 should be 2");
    }

    @Test
    public void testDivideResultingInDecimal() {
        assertEquals(2.5, calc.divide(5.0, 2.0), "5 / 2 should be 2.5");
    }

    @Test
    public void testDivideByZeroThrowsException() {
        // Tests if dividing by zero throws the correct mathematical exception
        assertThrows(ArithmeticException.class, () -> {
            calc.divide(5.0, 0.0);
        }, "Dividing by zero should throw an ArithmeticException");
    }
}
