public class A_17 {

    public static int search(int nums[], int target) {
        // Modified Binary Search for Rotated Sorted Array
        int start = 0, end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target)
                return mid;
            if (nums[start] <= nums[mid]) // left section
            {
                if (nums[start] <= target && target <= nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else { // Right Section
                if (nums[mid] <= target && target <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid + 1;
                }
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        // Search in Rotated Sorted Array
        int nums[] = { 4, 5, 6, 7, 0, 1, 2 };

        System.out.println(search(nums, 0));

    }
}