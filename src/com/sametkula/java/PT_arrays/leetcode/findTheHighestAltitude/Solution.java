package com.sametkula.java.PT_arrays.leetcode.findTheHighestAltitude;

public class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0, temp = 0;

        for (int i : gain) {
            temp += i;
            max = Math.max(max, temp);
        }

        return max;
    }
}
