package teachmeskills.lesson_12.task_6.components;

public class Array {
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public void changeling(int k) {
        int n = array.length;
        k = k % n;
        int[] turntable = new int[n];

        for (int i = 0; i < n; i++) {
            turntable[(i + k) % n] = array[i];
        }

        System.arraycopy(turntable, 0, array, 0, n);
    }

    public int[] getArray() {
        return array;
    }
}