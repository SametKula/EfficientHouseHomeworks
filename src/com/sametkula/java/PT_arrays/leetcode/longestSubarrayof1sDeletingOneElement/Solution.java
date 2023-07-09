package com.sametkula.java.PT_arrays.leetcode.longestSubarrayof1sDeletingOneElement;

public class Solution {
    public int longestSubarray(int[] nums) {
        int left = 0, right = 0, max = 0, zeros = 0, carry = 0;

        while (right < nums.length){
            if (nums[right] == 0){
                zeros++;
                carry = right;
            }

            while (zeros > 1){
                if (nums[left] == 0)
                    zeros--;
                left++;
            }
            max = Math.max(max, right - left + 1  - zeros);
            right++;
        }
        System.gc();
        return max == nums.length ? max - 1: max;
    }
}
