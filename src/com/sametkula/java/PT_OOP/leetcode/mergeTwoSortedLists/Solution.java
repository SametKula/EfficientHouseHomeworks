package com.sametkula.java.PT_OOP.leetcode.mergeTwoSortedLists;

import com.sametkula.java.PT_OOP.leetcode.addTwoNumbers.ListNode;

public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode result = new ListNode();
        ListNode dummy = result;
        while (list1!= null && list2!= null) {
            if (list1.val > list2.val){
                dummy.next = new ListNode(list2.val);
                list2 = list2.next;
            }else {
                dummy.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            dummy = dummy.next;
        }
        dummy.next = list1 == null? list2 : list1;
        // garbage collector calistirmak duruma bagli dusununebilir calistirildiginda memory kullanimi cok duserken zamandan kayip yasaniyor
        System.gc();
        return result.next;
    }
}
