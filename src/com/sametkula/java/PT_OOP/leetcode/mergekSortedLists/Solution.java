package com.sametkula.java.PT_OOP.leetcode.mergekSortedLists;

import com.sametkula.java.PT_OOP.leetcode.addTwoNumbers.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists.length == 0) return null;
        ListNode result = new ListNode();
        ListNode dummy = new ListNode();
        result.next = dummy;
        int min;

        for (ListNode listNode : lists) {
            min = Integer.MIN_VALUE;
            if (min > listNode.val){
                min = listNode.val;
                listNode = listNode.next;
            }
            dummy.val = min;
            dummy.next = new ListNode();
            dummy = dummy.next;
        }

        return result.next;
    }
}
