package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingleNonRepeatingTest {

    @Test
    void singleNonRepeating() {
        int[] nums = {1, 2, 3, 2, 1};
        SingleNonRepeating singleRepeating = new SingleNonRepeating();
        assertEquals(3,  singleRepeating.singleNonRepeating(nums));

    }
}