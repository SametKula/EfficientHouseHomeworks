package com.sametkula.java.test;


import com.sametkula.java.PT_arrays.leetcode.maxConsecutiveOnesIII.Solution;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class SolutionTest {

    @Test
    public void testLongestOnes() throws Exception {
        Solution solution = new Solution();

        Assertions.assertEquals(10,solution.longestOnes(new int[]{0,0,1,1,0,0,1,1,1,0,1,1,0,0,0,1,1,1,1}, 3));
    }



}
