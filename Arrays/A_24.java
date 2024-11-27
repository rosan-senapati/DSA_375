public class A_24 {
    public static void main(String[] args) {
        int nums[] = { 2, 3, -2, 4 };
        int n = nums.length;
        int totalmax, maxP, minP;
        totalmax = maxP = minP = nums[0];

        for (int i = 1; i < n; i++) {
            int currMax = maxP;
            int currMin = minP;
            minP = Math.min(nums[i], Math.min(currMin * nums[i], currMax * nums[i]));

            maxP = Math.max(nums[i], Math.max(currMin * nums[i], currMax * nums[i]));

            totalmax = Math.max(totalmax, maxP);

        }

        System.out.println("Total product of sub array is: " + totalmax);

    }
}
