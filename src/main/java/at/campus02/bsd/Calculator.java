package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * The Calculator class provides basic mathematical operations.
 * It includes methods for addition, subtraction, multiplication,
 * division and factorial.
 */
public class Calculator {
    // Creating the static logger attribute
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    /**
     * Adds two numbers together.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the sum of number1 and number2
     */
    public double add(double number1, double number2){
        logger.debug("Method add called with parameters: " + number1 + ", " + number2);
        return number1 + number2;
    }

    /**
     * Subtracts the second number from the first number.
     *
     * @param number1 the number to be subtracted from (minuend)
     * @param number2 the number to subtract (subtrahend)
     * @return the difference between number1 and number2
     */
    public double subtract(double number1, double number2){
        logger.debug("Method subtract called with parameters: " + number1 + ", " + number2);
        return number1 - number2;
    }

    /**
     * Divides the first number by the second number.
     * If the divisor is zero, it safely returns 0.0 to prevent crashing.
     *
     * @param number1 the number to be divided (dividend)
     * @param number2 the number to divide by (divisor)
     * @return the quotient of number1 and number2, or 0.0 if b is zero
     */
    public double divide(double number1, double number2) {
        logger.debug("Method divide called with parameters: " + number1 + ", " + number2);
        double result = 0;
        if (number2 == 0) {
            // Log the error for division by zero
            logger.error("Error: division by zero attempted with parameter: " + number1);
            System.out.println("Error: division with 0.");
        } else {
            result = number1 / number2;
        }
        return result;
    }


    /**
     * Multiplies two numbers together.
     *
     * @param number1 the first number
     * @param number2 the second number
     * @return the product of number1 and number2
     */
    public double multiply(double number1, double number2){
        logger.debug("Method multiply called with parameters: " + number1 + ", " + number2);
        return number1 * number2;
    }

    /**
     * Calculates the factorial of a given integer.
     * Returns 0 for negative numbers as per the assignment requirements.
     *
     * @param n the integer to calculate the factorial for
     * @return the factorial of n, or 0 if n is negative
     */
    public double factorial(int n) {
        if (n < 0) {
            return 0; // Assignment requirement for negative numbers
        }
        if (n == 0) {
            return 1; // 0! is always 1
        }

        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}