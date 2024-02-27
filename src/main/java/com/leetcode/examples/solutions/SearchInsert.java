package com.leetcode.examples.solutions;

//question 35
public class SearchInsert {
    /*   Input: nums = [1,3,5,6], target = 7
       Output: 2  */
    public int searchInsert(int[] nums, int target) {
        int place = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target || i + 1 == nums.length) {
                place = i;
                if (i + 1 == nums.length) {
                    place = i + 1;
                }
                break;
            }
        }
        return place;
    }
}
