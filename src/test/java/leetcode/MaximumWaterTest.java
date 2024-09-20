package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaximumWaterTest {

    @Test
    void maximumWater() {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        MaximumWater maximumWater = new MaximumWater();
        assertEquals(56,  maximumWater.maximumWater(height));
    }
}