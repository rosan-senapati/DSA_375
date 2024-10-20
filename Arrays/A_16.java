import java.util.*;

public class A_16 {
    public static void main(String[] args) {
        // Chocolate Distribution Problem (Sliding window (sort then solve!!))
        int arr[] = { 7, 3, 2, 4, 9, 12, 56 }, m = 5;
        int result = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - m + 1; i++) {
            int min = arr[i];
            int max = arr[i + m - 1];

            result = Math.min(result, max - min);

        }
        System.out.println("Result: " + result);
    }
}
