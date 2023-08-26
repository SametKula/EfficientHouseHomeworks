package com.sametkula.java.PT_arrays.leetcode.twoSum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> hm = new HashMap<>();
        System.gc();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(target - nums[i])){
                System.gc();
                return new int[]{i, hm.get(target - nums[i])};
            }
            hm.put(nums[i], i);
        }
        return new int[]{0,0};
    }
}
