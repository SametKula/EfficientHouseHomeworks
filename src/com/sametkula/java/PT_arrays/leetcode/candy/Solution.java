package com.sametkula.java.PT_arrays.leetcode.candy;

public class Solution {
    public int candy(int[] ratings) {
        int[] candies = new int[ratings.length];
        int result = 0;
        candies[0] = 1;
        for (int i = 1; i < candies.length; i++) {
            candies[i] = 1;
            if (ratings[i] > ratings[i-1]){
                candies[i] = candies[i-1] + 1;
            }
        }
        for (int i = candies.length - 2; i >= 0; i--) {
            if (ratings[i] > ratings[i+1]){
                candies[i] = Math.max(candies[i], candies[i+1] + 1);
            }
        }
        for (int candy : candies) {
            result += candy;
        }
        return result;
    }
}
