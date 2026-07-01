Unit tests are essential because they serve as code documentation.

## Test Cases Implementation
The following test cases have been implemented to verify the Calculator's functionality using JUnit:

### Addition (`add`)
*   **Positive Numbers:** Checks if adding two standard positive numbers works (e.g., 5 + 3 = 8).
*   **Negative Numbers:** Checks the behavior when adding negative values (e.g., -5 + -3 = -8).
*   **Zero:** Verifies that adding zero to a number returns the original number (e.g., 5 + 0 = 5).

### Subtraction (`subtract`)
*   **Positive Numbers:** Checks standard subtraction (e.g., 5 - 3 = 2).
*   **Negative Results:** Ensures subtracting a larger number from a smaller number correctly yields a negative result (e.g., 5 - 10 = -5).
*   **Zero:** Verifies that subtracting zero leaves the number unchanged (e.g., 5 - 0 = 5).

### Multiplication (`multiply`)
*   **Positive Numbers:** Checks standard multiplication (e.g., 5 * 3 = 15).
*   **Negative Numbers:** Ensures a positive multiplied by a negative yields a negative result (e.g., 5 * -3 = -15).
*   **Zero Edge Case:** Verifies that any number multiplied by zero returns zero (e.g., 5 * 0 = 0).

### Division (`divide`)
*   **Clean Division:** Tests a standard division that results in a whole number (e.g., 10 / 5 = 2).
*   **Decimal Results:** Tests a division that should logically result in a floating-point number (e.g., 5 / 2 = 2.5).
*   **Division by Zero (Exception):** Verifies that the calculator correctly throws an `ArithmeticException` when attempting to divide by zero, preventing a system crash.