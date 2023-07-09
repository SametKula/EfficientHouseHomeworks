package com.sametkula.java.test;


import com.sametkula.java.PT_arrays.leetcode.longestSubarrayof1sDeletingOneElement.Solution;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class SolutionTest {

   @Test
    public void test(){
       Solution solution = new Solution();

       Assertions.assertEquals(5, solution.longestSubarray(new int[]{0,1,1,1,0,1,1,0,1}));
   }


}
