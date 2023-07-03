package com.sametkula.java.test;

import com.sametkula.java.PT_arrays.leetcode.maxNumberOfKSumPairs.Solution;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4};
        Solution solution = new Solution();
        int i = solution.maxOperations(arr,5);

        System.out.println(i);

    }
}
