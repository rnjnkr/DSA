package sort;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 34, 25, 12, 22, 11, 90};
        int len = arr.length;

        for (int i = 0; i < len - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < len - i - 1; j++) {     //len-i-1 because len-i is already sorted so run till len-i-1 only
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
        }
        for (int n : arr)
            System.out.print(n + " ");
    }
}
