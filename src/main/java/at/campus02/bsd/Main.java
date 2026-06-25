package at.campus02.bsd;

public class Main {
    public static void main(String[] args) {
        // Create a new instance of your calculator
        Calculator myCalc = new Calculator();

        // Call each method and print the result
        System.out.println("Testing Addition (10 + 5): " + myCalc.add(10, 5));
        System.out.println("Testing Subtraction (10 - 5): " + myCalc.subtract(10, 5));
        System.out.println("Testing Multiplication (10 * 5): " + myCalc.multiply(10, 5));
        System.out.println("Testing Division (10 / 5): " + myCalc.divide(10, 5));

        // Testing your division by zero safeguard!
        System.out.println("Testing Division by Zero (10 / 0):");
        myCalc.divide(10, 0);

        System.out.println("Viktoria Gospodinova");
    }
}