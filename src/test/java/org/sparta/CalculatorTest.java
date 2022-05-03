package org.sparta;

//import org.junit.Test;
//import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTest {

    Calculator calculator = new Calculator();

//    @ParameterizedTest
    @ParameterizedTest(name = "{index} => a={0}, b={1}, add={2}")
    @CsvSource({
            "5, 3, 8",
            "14, 3, 17",
            "-6, 6, 0",
            "36, -2,  34"
    })
    public void addNumbers(int n1, int n2, int sum) {
        assertEquals(sum, calculator.add(n1, n2));
    }


    @ParameterizedTest(name = "{index} => a={0}, b={1}, add={2}")
    @CsvSource({
            "5, 3, 2",
            "14, 3, 11",
            "-6, 6, -12",
            "36, -2, 38"
    })
    public void subtractNumbers(int n1, int n2, int result) {
        assertEquals(result, calculator.subtract(n1, n2));
    }

    @ParameterizedTest(name = "{index} => a={0}, b={1}, add={2}")
    @CsvSource({
            "5, 3, 15",
            "14, 3, 42",
            "-6, 6, -36",
            "36, -2, -72"
    })
    public void multiplyNumbers(int n1, int n2, int result) {
        assertEquals(result, calculator.multiply(n1, n2));
    }

    @ParameterizedTest(name = "{index} => a={0}, b={1}, add={2}")
    @CsvSource({
            "5, 3, 1",
            "14, 3, 4",
            "-6, 6, -1",
            "36, -2, -18"
    })
    public void divideNumbers(int n1, int n2, int result) {
        assertEquals(result, calculator.divide(n1, n2));
    }

    @Test
    public void divideNumbers() {
        int result = calculator.divide(6, 6);
        assertEquals(1, result);
    }

    @Test
    public void divisibleBy2 () {
        boolean result = calculator.isEven(8);
        assertTrue(result);
    }


    @Test
    public void multiplyPositiveNumber() {
        int result = calculator.multiply(6, 6);
        assertEquals(36, result);

    }
}
