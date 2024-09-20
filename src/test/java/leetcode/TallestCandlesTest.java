package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TallestCandlesTest {

    @Test
    void tallestCandles() {
        TallestCandles tallestCandles = new TallestCandles();
        int[] nums = {2,3,4,2,1,4,5,5,5, 6};
        assertEquals(1, tallestCandles.tallestCandles(nums));
    }
}