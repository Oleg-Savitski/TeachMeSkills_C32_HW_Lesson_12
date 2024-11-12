package teachmeskills.lesson_12.task_4.components;

import java.util.Scanner;

public class InputReader {
    private static Scanner scanner = new Scanner(System.in);

    public static int readNumber() {
        int number;
        while (true) {
            System.out.print(" Enter a number: ");
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                break;
            } else {
                System.out.println(" Enter the correct integer. ");
                scanner.next();
            }
        }
        return number;
    }
}