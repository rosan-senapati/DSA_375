public class A_14 {
    public static void main(String[] args) {
        // (Important!) Maximum-Subarray (Kaden's Algo)
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        int maxSum = 0;
        int curSum = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum += nums[i];
            if (curSum > maxSum)
                maxSum = curSum;
            if (curSum < 0)
                curSum = 0;
        }

        System.out.println("Maximum sum : " + maxSum);

    }
}
