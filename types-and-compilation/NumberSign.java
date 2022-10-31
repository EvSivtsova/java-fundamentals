import java.util.Random;

public class NumberSign {
    public static void main(String[] args) {
        Integer minimum = -100;
        Integer maximum = 100;
        Random rand = new Random();
        Integer randomNum = minimum + rand.nextInt((maximum - minimum) + 1);

        NumberSign app = new NumberSign();
        String sign = app.getNumberSign(randomNum);

        System.out.printf("The sign of the number %d is: %s\n", randomNum, sign);
    }

    public String getNumberSign(Integer number) {
        if (number < 0) {
            return "negative";
        } else if (number > 0) {
            return "positive";
        } else {
            return "zero";
        }
    }
}
