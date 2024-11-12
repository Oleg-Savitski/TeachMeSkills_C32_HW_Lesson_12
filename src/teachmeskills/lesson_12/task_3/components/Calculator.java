package teachmeskills.lesson_12.task_3.components;

public class Calculator {

    public static int calculateSum(String input) {
            int sum = 0;
            for (char c : input.toCharArray()) {
                if (Character.isDigit(c)) {
                    sum += Character.getNumericValue(c);
                }
            }
            return sum;
        }
}