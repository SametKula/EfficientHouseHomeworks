package com.sametkula.java.test;

import com.sametkula.java.PT_arrays.leetcode.maximumArerageSubarray.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class SolutionTest {
    @org.junit.Test
    @DisplayName("junit test results")
    public void findMaxAverage(){
        Solution solution = new Solution();
        int[] arr = new int[]{1,12,-5,-6,50,3};

        Assertions.assertEquals(12.75000,solution.findMaxAverage(arr,4));

    }


}
