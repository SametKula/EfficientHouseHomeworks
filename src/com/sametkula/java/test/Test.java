package com.sametkula.java.test;

import com.sametkula.java.PT_OOP.leetcode.addTwoNumbers.*;
import com.sametkula.java.PT_arrays.leetcode.kidsWithTheGreatestNumberOfCandies.Solution;
public class Test {
    public static void main(String[] args) {
        /*
        todo list
            list node
        Solution solution = new Solution();
        solution.printListNode(solution.addTwoNumbers(new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))))),new ListNode(9,new ListNode(9,new ListNode(9,new ListNode(9))))));
           */
        Solution solution = new Solution();
        System.out.println(solution.kidsWithCandies(new int[]{4,2,1,1,2}, 1));

    }
}
