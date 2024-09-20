package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumSubArrayTest {

    @Test
    void maxSubArray() {
        int nums[] = {2, 7, -4, - 5, 2};
        MaximumSubArray maximumSubArray = new MaximumSubArray();
        assertEquals(9, maximumSubArray.maxSubArray(nums));

    }
}