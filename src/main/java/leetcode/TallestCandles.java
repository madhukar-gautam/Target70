package leetcode;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class TallestCandles {

    public int tallestCandles(int[] nums){
        int count=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length ; i++) {
            if(map.containsKey(nums[i])){
                map.put(nums[i], map.get(nums[i])+1);
            }
            else{
                map.put(nums[i], 1 );
            }
        }
        count = map.get(Collections.max(map.keySet()));
        return count;
    }
}
