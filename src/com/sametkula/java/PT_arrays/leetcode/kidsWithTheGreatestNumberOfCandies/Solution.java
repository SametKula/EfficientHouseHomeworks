package com.sametkula.java.PT_arrays.leetcode.kidsWithTheGreatestNumberOfCandies;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>();

        for(int kid : candies){
            result.add(maxInArray(candies, kid + extraCandies) == kid + extraCandies);
        }

        return result;
    }
    private int maxInArray(int[] arr, int x){
        int max = arr[0];

        for(int i : arr){
            if(i > max){
                max = i;
            }
        }
        return Math.max(x, max);
    }
}
