package com.sametkula.java.PT_arrays.leetcode.maxNumberOfKSumPairs;

import java.util.Arrays;

public class Solution {
    public int maxOperations(int[] nums, int k){
        Arrays.sort(nums);
        int i = 0, j = nums.length - 1,count = 0;

        while(i < j){
            if (nums[i] + nums[j] == k){
                count++;
                i++;
                j--;
            }
            else if(nums[i] + nums[j] > k) j--;
            else i++;
        }

        return count;
    }
}
