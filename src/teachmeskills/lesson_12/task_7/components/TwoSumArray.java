package teachmeskills.lesson_12.task_7.components;

public class TwoSumArray {
    public static int[] twoSum(int[] num, int butt) {

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] + num[j] == butt) {
                    return new int[] { i, j };
                }
            }
        }
        return null;
    }
}