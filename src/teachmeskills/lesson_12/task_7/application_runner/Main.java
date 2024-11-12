package teachmeskills.lesson_12.task_7.application_runner;

import static teachmeskills.lesson_12.task_7.components.TwoSumArray.twoSum;

/** Дан массив целых чисел, найдите два числа, которые в сумме дают заданное число.
 * Функция twoSum должна возвращать индексы двух чисел так, чтобы они складывались
 * в целевое число. Например:
 * Ввод: числа = {2, 7, 11, 15}, цель = 9.
 * Выход: индекс[1] = 0, индекс[2] = 1.
 */

public class Main {
    public static void main(String[] args) {
        int[] num = {2, 7, 11, 15};
        int butt = 9; // if you enter a different number, there will be no solution.

        int[] result = twoSum(num, butt);

        if (result == null) {
            System.out.println(" No solution found. "); // enter another number.
        } else {
            System.out.println("Index [1] = " + result[0] + ", Index [2] = " + result[1]);
        }
    }
}