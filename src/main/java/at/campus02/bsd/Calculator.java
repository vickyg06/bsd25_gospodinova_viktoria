package at.campus02.bsd;

public class Calculator {
    public double add(double number1, double number2){
        return number1 + number2;
    }

    public double subtract(double number1, double number2){
        return number1 - number2;
    }

    public double divide(double number1, double number2) {
        double result = 0;
        if (number2 == 0) {
            System.out.println("Error: devision with 0.");
        } else {
            result = number1 / number2;
        }
        return result;
    }

    public double multiply(double number1, double number2){
        return number1*number2;
    }
}
