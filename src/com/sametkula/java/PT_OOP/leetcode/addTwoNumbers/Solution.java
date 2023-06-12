package com.sametkula.java.PT_OOP.leetcode.addTwoNumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int result = 0;
        ListNode sum = new ListNode(0);
        ListNode curr = sum;


        for (int i = 0; l1 != null || l2 != null; i++) {
            int carry = 0;

            if (l1.next != null){
                carry += l1.val;
                l1 = l1.next;
                System.out.println(1);
            }
            if (l2.next != null) {

                l2 = l2.next;
                System.out.println(2);
            }

            result += carry * pow(10,i);

        }
        while(result > 0) {
            curr.val = result / pow(10,getDigits(result) - 1);
            result = result % pow(10,getDigits(result) - 1);
            curr.next = new ListNode(0);
            curr = curr.next;

        }
        return sum;
    }
    public void printListNode(ListNode node) {
        while(node.next != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }
    public int pow(int value, int pow) {
        if(pow <= 0) return 1;
        int result = 1;

        for(int i = 0; i < pow; i++)
            result *= value;

        return result;
    }
    public int getDigits(int x) {
        if (x == 0) return 1;
        int result = 0;
        x = Math.abs(x);
        while(x > 0) {
            result++;
            x /= 10;
        }
        return result;
    }
}
