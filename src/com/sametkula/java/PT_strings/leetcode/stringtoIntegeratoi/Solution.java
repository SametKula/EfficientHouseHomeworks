package com.sametkula.java.PT_strings.leetcode.stringtoIntegeratoi;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int myAtoi(String s) {
        int result = 0, index = 0;
        boolean flag = false;

        while (true) {
            if ( !Character.isWhitespace(s.charAt(index)) && !Character.isDigit(s.charAt(index)) && s.charAt(index) != '-' && s.charAt(index) != '+')
                return 0;
            if (Character.isDigit(s.charAt(index)))
                break;
            if (s.charAt(index) == '-' && Character.isDigit(s.charAt(index + 1)))
                flag = true;
            index++;
            if (index == s.length())
                return 0;
        }
        int i = index;
        while( i < s.length() && Character.isDigit(s.charAt(i))) {
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && s.charAt(i) - '0' > 7))
                return flag ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            result = result * 10 + (s.charAt(i) - '0');
            i++;
        }
        return flag ? result * -1 : result;
    }
    @Test
    public void test(){
        System.out.println(myAtoi("   -42 "));
        System.out.println(myAtoi("   -42 "));
        System.out.println(myAtoi("   -42 "));
        System.out.println(myAtoi("   -4232323 "));
        System.out.println(myAtoi("   1321223142 "));
        System.out.println(myAtoi(" afsdafsdfs  1321223142 "));
        System.out.println(myAtoi(" afsdafsdfs  1321223142adasfasfasfas "));
        System.out.println(myAtoi(" afsdafsdfs  -1321223142adasfasfasfas "));
    }
}
