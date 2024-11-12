package teachmeskills.lesson_12.task_3.application_runner;

import teachmeskills.lesson_12.task_3.components.Calculator;
import teachmeskills.lesson_12.task_3.components.InputReader;

/**
 * Вводится число любой длины (от нуля и до бесконечности).
 * Надо найти сумму его чисел.
 */

public class Main {

    public static void main(String[] args) {
            String input = InputReader.readInput();
            int sum = Calculator.calculateSum(input);

            System.out.println("The sum of the digits: " + sum);
        }
}