package sort;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 34, 25, 12, 22, 11, 90, -44, 0, 1, 100, 96};
        int len = arr.length;

        for (int i = 1; i < len; i++) {
            int value = arr[i];
            int hole = i;

            while (hole > 0 && arr[hole - 1] > value) {
                arr[hole] = arr[hole - 1];
                hole--;
            }
            arr[hole] = value;
        }

        for (int n : arr)
            System.out.print(n + " ");
    }
}
