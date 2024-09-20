package leetcode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

        // Test 1: Basic case
        @Test
        public void testTwoSumBasicCase() {
            int[] nums = {2, 7, 11, 15};
            int target = 22;
            int[] result = TwoSum.twoSum(nums, target);
            System.out.println("Test Basic Case: " + Arrays.toString(result));
            assertEquals(Arrays.toString(result), Arrays.toString(new int[]{1, 3}));
            assert Arrays.equals(result, new int[]{1, 3}) : "Test Basic Case Failed";
        }

        @Test
        public void testTwoSumNoSolution() {
            int[] nums = {2, 7, 11, 15};
            int target = 30;
            int[] result = TwoSum.twoSum(nums, target);
            System.out.println("Test No Solution: " + Arrays.toString(result));
            assert Arrays.equals(result, new int[]{}) : "Test No Solution Failed";
        }
        @Test
        public void testTwoSumNegativeNumbers() {
            int[] nums = {-3, 4, 3, 90};
            int target = 0;
            int[] result = TwoSum.twoSum(nums, target);
            System.out.println("Test Negative Numbers: " + Arrays.toString(result));
            assert Arrays.equals(result, new int[]{0, 2}) : "Test Negative Numbers Failed";
        }

        @Test
        public void testTwoSumWithDuplicates() {
            int[] nums = {1, 3, 3, 7};
            int target = 6;
            int[] result = TwoSum.twoSum(nums, target);
            System.out.println("Test Duplicates: " + Arrays.toString(result));
            assert Arrays.equals(result, new int[]{1, 2}) : "Test With Duplicates Failed";
        }
        @Test
        public void testTwoSumSameNumberTwice() {
            int[] nums = {1, 2, 3, 4, 5};
            int target = 10;
            int[] result = TwoSum.twoSum(nums, target);
            System.out.println("Test Same Number Twice: " + Arrays.toString(result));
            assert Arrays.equals(result, new int[]{}) : "Test Same Number Twice Failed";
        }
        @Test
        public void testTwoSumSingleElement() {
            int[] nums = {5};
            int target = 5;
            int[] result = TwoSum.twoSum(nums, target);
            assert Arrays.equals(result, new int[]{}) : "Test Single Element Failed";
        }
    }
