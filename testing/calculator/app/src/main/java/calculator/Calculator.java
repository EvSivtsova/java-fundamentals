package calculator;

import javax.swing.JSpinner.NumberEditor;

public class Calculator {
    public static void main(String[] args) {

    }

    public Integer add(Integer integer1, Integer integer2) {
        return integer1 + integer2;
    }

    public Integer subtract(Integer integer1, Integer integer2) {
        return integer1 - integer2;
    }

    public Integer multiply(Integer integer1, Integer integer2) {
        return integer1 * integer2;
    }

    public Double divide(Integer integer1, Integer integer2) {
        return 1.0 * integer1 / integer2;
    }
}
