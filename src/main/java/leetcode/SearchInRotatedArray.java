package leetcode;

public class SearchInRotatedArray {

    public int searchInRotatedArray(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (start <= mid) {
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                     }

                    if (target > nums[mid] && target < nums[end]) {
                        start = mid + 1;
                    } else {
                        end = mid - 1;
                    }

            }

        }
        return -1;
    }
}
