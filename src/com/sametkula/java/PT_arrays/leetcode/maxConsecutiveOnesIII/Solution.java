package com.sametkula.java.PT_arrays.leetcode.maxConsecutiveOnesIII;

public class Solution {
    public int longestOnes(int[] nums, int k){
        int left = 0, right = 0, zeros = 0, max = 0;

        while(right < nums.length){
            if (nums[right] == 0 )
                zeros++;

            if (zeros == k){
                max = Math.max(right - left, max);

                left++;
                while(true){
                    if (nums[left] == 0)
                        break;
                    left++;
                }
                zeros--;
            }
            right++;
            System.out.printf("%d left ::: %d right ::: %d max\n", left, right, max);
        }

        return Math.max(right - left, max);
    }
}
