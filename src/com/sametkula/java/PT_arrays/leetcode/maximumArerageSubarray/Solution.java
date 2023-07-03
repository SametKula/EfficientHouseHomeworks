package com.sametkula.java.PT_arrays.leetcode.maximumArerageSubarray;
public class Solution {
    public double findMaxAverage(int[] nums, int k){
        int tempSum = 0;

        for (int i = 0; i < k; i++)
            tempSum += nums[i];

        int max = tempSum;
        for (int i = k; i < nums.length; i++){
            tempSum -= nums[i - k];
            tempSum += nums[i];
            max = Math.max(tempSum, max);
        }

        return max / (double) k;
    }
}

