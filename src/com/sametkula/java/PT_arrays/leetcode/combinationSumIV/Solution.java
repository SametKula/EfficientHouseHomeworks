package com.sametkula.java.PT_arrays.leetcode.combinationSumIV;

import org.junit.Test;

import java.util.Arrays;

public class Solution {
    int[] nums ;
    public int combinationSum4(int[] nums, int target) {
        this.nums = nums;
        return helper(target);
    }
    private int helper(int curr){
        if (curr == 0) return 1;
        if (curr < 0) return 0;

        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result += helper(curr - nums[i]);
        }
        return result;
    }

    @Test
    public void test(){
        System.out.println(combinationSum4(new int[]{1,2,3}, 4));
        System.out.println(combinationSum4(new int[]{1,2,3,1,3,4,354,533,232,43}, 4));

    }
}
