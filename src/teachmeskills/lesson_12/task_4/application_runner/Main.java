package teachmeskills.lesson_12.task_4.application_runner;

import teachmeskills.lesson_12.task_4.components.Algorithm;
import teachmeskills.lesson_12.task_4.components.InputReader;

/** The algorithm is the remainder method
 */
public class Main {
    public static void main(String[] args) {
            System.out.println("Finding the greatest common divisor (G.C.D)");

            int num1 = InputReader.readNumber();
            int num2 = InputReader.readNumber();

            int gcd = Algorithm.countingMethod(num1, num2);

            System.out.println("G.C.D " + num1 + " & " + num2 + " equal to " + gcd);
        }
}