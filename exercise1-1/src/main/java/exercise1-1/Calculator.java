package exercise1;

/**
 * A simple calculator that performs basic arithmetic operations.
 * <p>
 * Supports addition, subtraction, multiplication, division,
 * squaring, and square root operations on integers.
 * </p>
 */
public class Calculator {

    /**
     * Adds two integers together
     *
     * @param a the first operand
     * @param b the second operand
     * @return the sum of {a} and {b}
     * @see #subtract(int, int)
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts {@code b} from {@code a}.
     *
     * @param a the value to subtract from
     * @param b the value to subtract
     * @return the difference of {a} and {b}
     * @see #add(int, int)
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two integers.
     *
     * @param a the first factor
     * @param b the second factor
     * @return the product of {a} and {b}
     * @see #divide(int, int)
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides {@code a} by {@code b}.
     *
     * @param a the dividend
     * @param b the divisor (must not be zero)
     * @return the integer quotient of {a} divided by {b}
     * @throws IllegalArgumentException if {b} is zero
     * @see #multiply(int, int)
     */
    public int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero");
        }
        return a / b;
    }

    /**
     * Returns the square of an integer.
     *
     * @param a the value to square
     * @return {a} raised to the power of 2
     * @see #squareRoot(int)
     */
    public int square(int a) {
        return a * a;
    }

    /**
     * Returns the square root of a non-negative integer.
     *
     * @param a the value to find the square root of (must be 0)
     * @return the square root of {a} as a {double}
     * @throws IllegalArgumentException if {a} is negative
     * @see #square(int)
     */
    public double squareRoot(int a){
        if (a < 0){
            throw new IllegalArgumentException("Cannot square root a negative number");
        }
        return Math.sqrt(a);
    }
}
