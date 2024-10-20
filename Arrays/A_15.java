import java.util.*;

public class A_15 {
    public static void main(String[] args) {
        // Contains Duplicate
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        boolean flag = false;
        Map<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (mp.containsKey(nums[i])) {
                mp.put(nums[i], mp.get(nums[i]) + 1);
            } else {
                mp.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey());
                flag = true;
            }
        }

        if (flag)
            System.out.println("Contains!!");
        else
            System.out.println("Not Contains!!");
    }
}
