package teachmeskills.lesson_12.task_5.reasoning;

import java.util.Scanner;

import static teachmeskills.lesson_12.constants.ConstantsRegex.DOUBLE_PATTERN;
import static teachmeskills.lesson_12.constants.ConstantsRegex.VALUE_REGEX;

public class InputReader {
    private static final Scanner scanner = new Scanner(System.in);

    public static double readAmount() {
        String input;
        double amount;
        while (true) {
            System.out.print(" Enter the initial deposit amount: ");
            input = scanner.nextLine();
            if (DOUBLE_PATTERN.matcher(input).matches()) {
                amount = Double.parseDouble(input);
                if (amount > 0) {
                    return amount;
                } else {
                    System.out.println(" The amount must be positive! ");
                    System.out.println(" Please enter the correct amount. ");
                }
            }
        }
    }

    public static int readYears() {
        String input;
        int years;
        while (true) {
            System.out.print(" Enter the number of years for your contribution. ");
            input = scanner.nextLine();
            if (input.matches(VALUE_REGEX)) {
                years = Integer.parseInt(input);
                if (years > 0) {
                    return years;
                } else {
                    System.out.println(" Please enter the correct number of years. ");
                    System.out.println(" The number of years should not be zero. ");
                }
            }
        }
    }

    public static double readRate() {
        String input;
        double rate;
        while (true) {
            System.out.print(" Enter the annual interest rate (in %). ");
            input = scanner.nextLine();
            if (DOUBLE_PATTERN.matcher(input).matches()) {
                rate = Double.parseDouble(input);
                if (rate >= 0) {
                    return rate / 100;
                } else {
                    System.out.println(" The interest rate should be non-negative! ");
                    System.out.println(" Please enter the correct interest rate. ");
                }
            }
        }
    }

    public static String getStringInput() {
        return scanner.nextLine();
    }
}