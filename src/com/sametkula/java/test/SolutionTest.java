package com.sametkula.java.test;


import com.sametkula.java.PT_arrays.leetcode.findTheDifferenceOfTwoArrays.Solution;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SolutionTest {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    while(true){
      int i = Integer.parseInt(kb.nextLine());
    }
  }

  @Test
  synchronized public void test(){
    Solution solution = new Solution();

    System.out.println(solution.findDifference(new int[]{1, 2, 3} , new int[]{4, 2, 6}));
  }


}
