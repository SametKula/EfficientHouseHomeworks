package com.sametkula.java.PT_strings.leetcode.greatestCommonDivisorOfStrings;

public class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) return "";

        for (int i = Math.min(str1.length(), str2.length()); i > 0; i--)
            if (str1.length() % i == 0 && str2.length() % i == 0)
                return str1.substring(0, i);

        return str1.substring(0, 1);
    }
}
