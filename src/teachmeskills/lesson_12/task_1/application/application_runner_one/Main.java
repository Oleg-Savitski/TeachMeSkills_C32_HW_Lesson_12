package teachmeskills.lesson_12.task_1.application.application_runner_one;


import teachmeskills.lesson_12.task_1.application.verification_code.HexCodeVerification;

import java.util.Scanner;

/** Написать программу, что переданная строка -
 * это hex code для описание цвета.
 * Например: при вводе в программу значения #8b2323,
 * программа должна вернуть - Yes.
 */

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputHexCode;

        while (true) {
            System.out.println(" Enter the hex color code #8b2323: ");
            inputHexCode = scanner.nextLine();
            if (inputHexCode.trim().isEmpty()) {
                System.out.println(" Error: an empty value was entered, try again. ");
                continue;
            }

            HexCodeVerification hesCodeVerification = new HexCodeVerification(inputHexCode);

            if (hesCodeVerification.isValidCode()) {
                System.out.println("Yes");
                break;
            } else {
                System.out.println(" Error: incorrect hex code was entered, try again. ");
            }
        }

        scanner.close();
    }
}