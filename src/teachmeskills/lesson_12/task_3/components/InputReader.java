package teachmeskills.lesson_12.task_3.components;

import java.util.Scanner;

import static teachmeskills.lesson_12.constants.ConstantsRegex.VALUE_REGEX;

public class InputReader {

    private static Scanner scanner = new Scanner(System.in);

    public static String readInput() {
        String input;
        while (true) {
            System.out.println("Enter a number: ");
            input = scanner.nextLine();

            if (input.matches(VALUE_REGEX)) {
                break;
            } else {
                System.out.println("The input must contain only numbers.");
            }
        }
        return input;
    }
}