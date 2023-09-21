package com.sametkula.java.PT_OOP.leetcode.linkedListCycle;


import com.sametkula.java.PT_OOP.leetcode.addTwoNumbers.ListNode;

import java.util.HashSet;

public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;

        ListNode left = head;
        ListNode right = head.next;

        while ( left != right){
            if (right == null || right.next == null) return false;

            left = left.next;
            right = right.next.next;
        }
        // System.gc(); kullanimi memory de cok iyi bir performans sagliyor ama sureyi biraz arttiriyor
        return true;
    }
    public boolean anotherSolution(ListNode head){
        var hs = new HashSet<String>();
        while (head != null) {
            if (hs.contains(head.toString()))
                return true;
            hs.add(head.toString());
            head = head.next;
        }
        return false;
    }
}
