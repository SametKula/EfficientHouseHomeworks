package com.sametkula.java.PT_arrays.leetcode.threeSum;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();
        Set<List<Integer>> result = new HashSet<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++) {

            int left = i + 1, right = nums.length - 1;

            while (left < right) {
                int thereSum = nums[left] + nums[right] + nums[i];
                if (thereSum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                }
                else if (thereSum < 0)
                    left++;
                else
                    right--;

            }
        }
        return new ArrayList<>(result);
    }
}
