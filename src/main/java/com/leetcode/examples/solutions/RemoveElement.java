package com.leetcode.examples.solutions;

//question 27
public class RemoveElement {
    /*Input: nums = [0,1,2,2,3,0,4,2], val = 2
      Output: 5, nums = [0,1,4,0,3,_,_,_]  */
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int newLength = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] != val) {
                nums[newLength] = nums[i];
                newLength++;
            }
        }

        return newLength;
    }
}
