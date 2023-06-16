package com.sametkula.java.PT_strings.leetcode.isSubsequence;

public class Solution {
    public boolean isSubsequence(String s, String t){
        for (int i = 0; i < s.length(); i++) {
            if (!t.contains(String.valueOf(s.charAt(i)))) return false;
            int pos = t.indexOf(s.charAt(i));
            t = t.substring(pos);
        }
        return true;
    }
}
