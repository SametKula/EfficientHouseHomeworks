package com.sametkula.java.test;

import com.sametkula.java.PT_OOP.leetcode.addTwoNumbers.*;
import com.sametkula.java.PT_strings.leetcode.greatestCommonDivisorOfStrings.Solution;
public class Test {
    public static void main(String[] args) {
        /*
        Solution solution = new Solution();
        solution.printListNode(solution.addTwoNumbers(new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))),new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))));
           */
        Solution solution = new Solution();
        System.out.println(solution.gcdOfStrings("ABABAB", "ABAB"));

    }
}
