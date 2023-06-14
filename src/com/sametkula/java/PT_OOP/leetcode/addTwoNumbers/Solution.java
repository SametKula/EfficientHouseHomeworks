package com.sametkula.java.PT_OOP.leetcode.addTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode();
        ListNode dummy = result;
        int remain = 0;

        while(l1 != null || l2 != null || remain >= 1) {
            int carry = 0;
            if (l1 != null){
                carry += l1.val;
                l1 = l1.next;
            }
            if (l2 != null){
                carry += l2.val;
                l2 = l2.next;
            }
            carry += remain;
            remain = carry / 10;
            dummy.next = new ListNode(carry % 10);
            dummy = dummy.next;
        }
        return result.next;
    }




    /*public int getDigits(int x) {
        x = Math.abs(x);
        return (String.valueOf(x)).length();
    }
    public int getListValue(ListNode node) {
        int result = 0,i =0;

        for (;node.next != null; i++) {
            result += node.val * Math.pow(10,i);
            node = node.next;
        }
        result += node.val * Math.pow(10,i);

        return result;
    }
    public ListNode valueOf(int value){
        if (value / 10 == 0) return new ListNode(value);

        ListNode result = new ListNode();
        ListNode dummy = result;

        int i = 1 , digit = getDigits(value);
        while( i < digit){
            dummy.val = value % 10;
            value = value / 10;

            dummy.next = new ListNode();
            dummy = dummy.next;
            i++;
        }
        dummy.val = value % 10;

        return result;
    }*/
}
