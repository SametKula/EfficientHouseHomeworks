package com.sametkula.java.PT_arrays.leetcode.containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
        int max1 =  height[0], max1Pos = 0;
        int max2 =  height[height.length - 1], max2Pos = height.length - 1;

        /*for (int i = 0 ,j = height.length - 1;i < j ;i++, j--) {
            if(max1 < height[i]){
                max1 = height[i];
                max1Pos = i;
            }
            if(max2 < height[i] && height[i] != max1){
                max2 = height[i];
                max2Pos = i;
            }
        }*/

        for(int i = 1; i < height.length; i++)
            if(max1 < height[i]){
                max1 = height[i];
                max1Pos = i;
            }

        for(int i = height.length - 2; i > max1Pos; i--)
            if(max2 < height[i] && height[i] != max1){
                max2 = height[i];
                max2Pos = i;
            }
        System.out.printf("max1 : %d, max2 : %d\n", max1, (max2Pos - max1Pos));
        System.out.println(max1Pos + " sss  " + max2Pos);
        return (max2Pos - max1Pos) * Math.min(max1, max2);

    }
}
