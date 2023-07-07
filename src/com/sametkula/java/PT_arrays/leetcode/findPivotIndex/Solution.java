package com.sametkula.java.PT_arrays.leetcode.findPivotIndex;

import java.util.Arrays;

public class Solution {
    public int pivotIndex(int[] nums) {
        int rightSum = 0;

        for (int i : nums)
            rightSum += i;

        rightSum -= nums[0];

        int leftSum = 0;


        for (int i = 0; i < nums.length - 1; i++){
            if (rightSum == leftSum) return i;

            leftSum += nums[i];
            rightSum -= nums[i + 1];
        }
        if (rightSum == leftSum) return nums.length - 1;

        return -1;
    }
}
