package com.sametkula.java.PT_strings.leetcode.reverseWordsInAString;

public class Solution {
    public String reverseWords(String s) {
        String[] strs = s.trim().split(" ");
        StringBuilder sb = new StringBuilder();

        sb.append(strs[strs.length - 1]);
        for (int i = strs.length - 2; i > -1; i--) {
            if (strs[i].isBlank()) continue;
            sb.append(" ").append(strs[i].trim());
        }
        return sb.toString();
    }
}
