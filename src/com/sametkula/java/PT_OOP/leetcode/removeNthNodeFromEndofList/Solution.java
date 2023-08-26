package com.sametkula.java.PT_OOP.leetcode.removeNthNodeFromEndofList;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode result = new ListNode(0);
        result.next = head;
        ListNode right = result;
        ListNode left = result;

        for (int i = 0; i < n; i++)
            right = right.next;

        while (right != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return result.next;
    }

}
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

