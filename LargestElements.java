import java.util.Arrays;

public class LargestElements {
    public static int[] findKLargest(int[] arr, int k) {
        Arrays.sort(arr);
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 3, 5, 6, 8, 2};
        int k = 3;
        int[] largest = findKLargest(arr, k);
        System.out.println("The " + k + " largest elements are: " + Arrays.toString(largest));
    }
}
