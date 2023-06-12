package com.sametkula.java.PT_strings.leetcode.mergeStringAltemately;

public class Solution {
    public static String mergeAlternately(String word1, String word2) {
        String str = new String("");
        int i = 0, j = 0;

        do {

            if (i < word1.length()) {
                str = str.concat(String.valueOf(word1.charAt(i)));
                i++;
            }

            if (j < word2.length()) {
                str = str.concat(String.valueOf(word2.charAt(j)));
                j++;
            }


        } while (i != word1.length() || j != word2.length());
        return str;
    }
}
