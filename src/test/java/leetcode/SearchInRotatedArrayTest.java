package leetcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SearchInRotatedArrayTest {

    @Test
    void searchInRotatedArray() {
        int[] nums = {3,4,5,0,1,2};
        int target = 0;
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        assertEquals(3, searchInRotatedArray.searchInRotatedArray(nums, target));
    }
    @Test
    void searchInRotatedArrayNotFound() {
        int[] nums = {3,4,5,0,1,2};
        int target = 6;
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        assertEquals(-1, searchInRotatedArray.searchInRotatedArray(nums, target));
    }
    @Test
    void searchInRotatedArrayNotFoundWithHighest() {
        int[] nums = {3,4,5,0,1,2};
        int target = 5;
        SearchInRotatedArray searchInRotatedArray = new SearchInRotatedArray();
        assertEquals(2, searchInRotatedArray.searchInRotatedArray(nums, target));
    }
}