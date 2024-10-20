public class A_12_2 {
    public static void main(String[] args) {
        // Maximum and Minimum Element in an Array

        int arr[] = { 5, 45, 8, 9, 6, 3 };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min)
                min = arr[i];
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Min: " + min + " Max: " + max);
    }
}
