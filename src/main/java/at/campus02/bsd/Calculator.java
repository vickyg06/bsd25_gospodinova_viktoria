package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Calculator {
    // Creating the static logger attribute
    private static final Logger logger = LogManager.getLogger(Calculator.class);

    public double add(double number1, double number2){
        logger.debug("Method add called with parameters: " + number1 + ", " + number2);
        return number1 + number2;
    }

    public double subtract(double number1, double number2){
        logger.debug("Method subtract called with parameters: " + number1 + ", " + number2);
        return number1 - number2;
    }

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

    public double multiply(double number1, double number2){
        logger.debug("Method multiply called with parameters: " + number1 + ", " + number2);
        return number1 * number2;
    }
}