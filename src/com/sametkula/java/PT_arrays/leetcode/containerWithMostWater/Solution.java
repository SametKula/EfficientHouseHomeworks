package com.sametkula.java.PT_arrays.leetcode.containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        /*int max = 0;

        for (int i = 0; i < height.length; i++)
            for (int j = height.length - 1; j > i; j--){
                max = Math.max(max,(j - i) * Math.min(height[i], height[j]));
            }

        return max;*/

        int left = 0 , right = height.length - 1, max = 0;

        while(left < right){
            max = Math.max(max,Math.min(height[left], height[right]) * (right - left));

            if (height[right] > height[left])
                left++;
            else
                right--;
        }


        return max;
    }
}
