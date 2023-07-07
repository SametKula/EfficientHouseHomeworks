package com.sametkula.java.test;

import com.sametkula.java.PT_arrays.leetcode.findPivotIndex.Solution;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class SolutionTest {

    @Test
    public void testFindPivotIndex() throws Exception {
        Solution solution = new Solution();

        Assertions.assertEquals(7,solution.pivotIndex(new int[]{1 , 4, 4, 3, 4, 6, 8,  2,  5,  6,  7,  8, 4}));
    }
    @Test
    public void testFindPivotIndex2() throws Exception {
        Solution solution = new Solution();

        Assertions.assertEquals(0,solution.pivotIndex(new int[]{2,1,-1}));
    }


}
