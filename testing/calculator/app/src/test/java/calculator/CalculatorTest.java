package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
    @Test public void shouldAddTwoAndTwo() {
        Calculator calc = new Calculator();
        assertEquals("2 + 2 should equal 4", Integer.valueOf(4), calc.add(2, 2));
    }

    @Test public void shouldSubtractTwoFromFour() {
        Calculator calc = new Calculator();
        assertEquals("4 - 2 should equal 2", Integer.valueOf(2), calc.subtract(4, 2));
    }
}
