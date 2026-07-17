package test;

import exercise1.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldSumTwoNumbersAndReturnTheResult() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(-1, calculator.add(-3, 2));
        assertEquals(0, calculator.add(0, 0));

    }

    @Test
    void shouldSubtractTwoNumbersAndReturnTheResult() {
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(-5, calculator.subtract(-2, 3));
        assertEquals(0, calculator.subtract(4, 4));
    }

    @Test
    void shouldMultiplyTwoNumbersAndReturnTheResult() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(5, 0));
        assertEquals(-6, calculator.multiply(-2, 3));
    }

    @Test
    void testDivide() {
        assertEquals(4, calculator.divide(8, 2));
        assertEquals(-3, calculator.divide(-9, 3));
        assertEquals(0, calculator.divide(0, 5));
    }

    @Test
    void testDivideByZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }

    @Test
    void testSquare() {
        assertEquals(9, calculator.square(3));
        assertEquals(0, calculator.square(0));
        assertEquals(4, calculator.square(-2));
    }

    @Test
    void testSquareRoot() {
        assertEquals(3.0, calculator.squareRoot(9));
        assertEquals(2.0, calculator.squareRoot(4));
        assertEquals(0.0, calculator.squareRoot(0));
    }

    @Test
    void testSquareRootNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-1));
    }
}
