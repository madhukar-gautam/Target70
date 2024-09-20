package leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int sum =22;
        System.out.println(Arrays.toString(twoSum(nums, sum)));
    }

    public static int[] twoSum(int[] nums, int sum) {
        int[] result = new int[nums.length];
        Map<Integer, Integer> sumMap= new HashMap<>();
        for (int i = 0; i <nums.length ; i++) {
            if(sumMap.containsKey(sum-nums[i])){
                return new int[]{sumMap.get(sum-nums[i]), i};
            }
           sumMap.put(nums[i], i);

        }

        return new int[]{};
    }
}
