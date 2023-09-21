package com.sametkula.java.PT_basics.leetcode.reverseInteger;

import org.junit.Test;

public class Solution {
    public int reverse(int x) {
        long result = 0L;

        while (x != 0) {
            result += x % 10;
            result *= 10;
            x /= 10;
        }
        result /= 10;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) return 0;
        if (result < 0)
            return (int) (result * -1);
        return (int) result;
    }
    @Test
    public void test() {
        System.out.println(reverse(123));
        System.out.println(1534236469);
        System.out.println(reverse(1534236469));
    }
}
