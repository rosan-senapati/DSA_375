public class A_14_2 {
    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        int ans = Integer.MIN_VALUE;
        int sum = 0;

        for (int x : nums) {
            sum = Math.max(x, sum + x);
            ans = Math.max(ans, sum);
        }

        System.out.println("Maximum sum : " + ans);
    }
}
