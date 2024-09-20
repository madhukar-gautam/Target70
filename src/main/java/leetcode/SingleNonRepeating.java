package leetcode;

public class SingleNonRepeating {
    public static void main(String[] args) {

    }

    public int singleNonRepeating(int[] nums) {
        int sing = nums[0];
        for (int i = 1; i < nums.length ; i++) {
            sing = sing ^ nums[i];
        }
        return sing;
    }
}
