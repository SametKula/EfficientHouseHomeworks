package com.sametkula.java.PT_strings.leetcode.longestPalindromicSubstring;

public class Palindrome {
    int maxLength, leftBorder;
    public String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;

        for (int i = 0; i < s.length(); i++) {
            expand(s,i,i);
            expand(s,i,i + 1);

        }
        return s.substring(leftBorder,leftBorder + maxLength);
    }
    public void expand(String s, int i, int j){
        while (i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
            i--;
            j++;
        }
        if (maxLength < j - i - 1) {
            maxLength = j - i - 1;
            leftBorder = i + 1;
        }
    }
}
