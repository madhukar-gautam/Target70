package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DuplicatesInArrayTest {

    @Test
    void duplicatesInArray() {
        int[] nums = {2,3,2,4,5,3,1,1,5};
        DuplicatesInArray duplicatesInArray = new DuplicatesInArray();
        assertArrayEquals(new int[]{2,3,1}, duplicatesInArray.duplicatesInArray(nums) );
    }
}