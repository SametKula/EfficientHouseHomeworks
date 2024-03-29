package com.sametkula.java.PT_arrays.leetcode.romantoInteger;


public class Solution {
    public int romanToInt(String s) {
        if (s.length() == 0)
            return 0;

        int result = 0;

        for (int i = 0; i < s.length(); i++)
            if (i < s.length() - 1 && translate(s.charAt(i)) < translate(s.charAt(i + 1)))
                result -= translate(s.charAt(i));
            else
                result += translate(s.charAt(i));

        return result;
    }
    private int translate(char c){
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

}
