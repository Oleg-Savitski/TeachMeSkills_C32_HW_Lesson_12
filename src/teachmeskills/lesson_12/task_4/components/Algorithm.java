package teachmeskills.lesson_12.task_4.components;

/** This class contains a method for calculating G.C.D
 */
public class Algorithm {
    public static int countingMethod(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);

        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}