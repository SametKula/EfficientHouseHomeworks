package com.sametkula.java.PT_arrays.leetcode.moveZeroes;

public class Solution {
    public void moveZeroes(int[] nums) {
        int zero;
        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == 0)
                for(int j = i + 1; j < nums.length; j++) {
                    if (nums[j] != 0){
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
    }
}