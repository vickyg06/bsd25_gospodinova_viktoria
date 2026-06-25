package at.campus02.bsd;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    // Initialize the logger for the Main class
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static void main(String[] args) {
        // Your name output
        System.out.println("Viktoria Gospodinova");

        // The required Info and Error logs
        logger.info("This is an INFO message: The calculator app is starting.");
        logger.error("This is an ERROR message: Simulated error for testing purposes.");

        Calculator myCalc = new Calculator();

        System.out.println("Testing Addition (10 + 5): " + myCalc.add(10, 5));
        System.out.println("Testing Subtraction (10 - 5): " + myCalc.subtract(10, 5));
        System.out.println("Testing Multiplication (10 * 5): " + myCalc.multiply(10, 5));
        System.out.println("Testing Division (10 / 5): " + myCalc.divide(10, 5));

        System.out.println("Testing Division by Zero (10 / 0):");
        myCalc.divide(10, 0);
    }
}