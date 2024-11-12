package teachmeskills.lesson_12.task_6.application_runner;

import teachmeskills.lesson_12.task_6.components.Array;

import java.util.Arrays;

/** Повернуть массив из n элементов вправо на k шагов.
 Например, с n = 7 и k = 3 массив [1,2,3,4,5,6,7] вращается до [5,6,7,1,2,3,4].
 */

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        int k = 3;

        Array rotor = new Array(array);
        rotor.changeling(k);

        System.out.println(Arrays.toString(rotor.getArray()));
    }
}