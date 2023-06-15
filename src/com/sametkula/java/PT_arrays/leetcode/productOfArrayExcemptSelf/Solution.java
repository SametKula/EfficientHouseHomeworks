package com.sametkula.java.PT_arrays.leetcode.productOfArrayExcemptSelf;

public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int sum = 1, zeroIndex = 0,zeroCount=0;

        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0) {
                if (zeroCount == 1) return new int[nums.length];

                zeroIndex = i;
                zeroCount++;
            }
            else
                sum *= nums[i];

        }
        if (zeroCount == 1) {
            nums = new int[nums.length];
            nums[zeroIndex] = sum;
            return nums;
        }

        if (zeroCount == 0)
            for (int i = 0; i < nums.length; i++)
                nums[i] = sum / nums[i];

        return nums;
    }
}
