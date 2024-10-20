public class A_13 {
    public static void main(String[] args) {
        // Reverse the Array
        int arr[] = { 5, 45, 8, 9, 6, 3 };

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        for (int x : arr) {
            System.out.print(x + " ");
        }

    }
}
