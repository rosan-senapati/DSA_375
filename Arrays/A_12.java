import java.util.Arrays;

public class A_12 {
    public static void main(String[] args) {
        // Maximum and Minimum Element in an Array

        int arr[] = { 5, 45, 8, 9, 6, 3 };
        Arrays.sort(arr);
        System.out.println("Min: " + arr[0] + " Max: " + arr[arr.length - 1]);
    }
}