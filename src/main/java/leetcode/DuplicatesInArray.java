package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class DuplicatesInArray {
    public int[] duplicatesInArray(int[] nums){
        List<Integer> result = new ArrayList<Integer>();
        HashSet<Integer> hashSet = new HashSet<>();
        for (int i = 0; i < nums.length ; i++) {
            if(!hashSet.contains(nums[i])){
                hashSet.add(nums[i]);
            }
            else {
                result.add(nums[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
