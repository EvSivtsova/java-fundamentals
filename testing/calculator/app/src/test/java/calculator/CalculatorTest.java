package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import javax.swing.JSpinner.NumberEditor;

public class CalculatorTest {
    @Test 
    public void shouldAddTwoAndTwo() {
        Calculator calc = new Calculator();
        assertEquals("2 + 2 should equal 4", Integer.valueOf(4), calc.add(2, 2));
    }

    @Test 
    public void shouldSubtractTwoFromFour() {
        Calculator calc = new Calculator();
        assertEquals("4 - 2 should equal 2", Integer.valueOf(2), calc.subtract(4, 2));
    }

    @Test
    public void shouldMultipleTwoNumbers() {
        Calculator calc = new Calculator();
        assertEquals("3 * 9 should equals 27", Integer.valueOf(27), calc.multiply(3, 9));
    }

    @Test
    public void shouldDivideTwoNumbers() {
        Calculator calc = new Calculator();
        Number expectedNum = 9.0;
        assertEquals("27 / 3 equals to 9.0", expectedNum, calc.divide(27, 3));
    }

    @Test
    public void shouldDivideTwoNumbersDouble() {
        Calculator calc = new Calculator();
        Number expectedNum = 9.333333333333334;
        assertEquals("28 / 3 equals to 9.33", expectedNum, calc.divide(28, 3));
    }
}
