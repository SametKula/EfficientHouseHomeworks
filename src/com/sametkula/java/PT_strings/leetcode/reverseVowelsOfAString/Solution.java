package com.sametkula.java.PT_strings.leetcode.reverseVowelsOfAString;

import java.util.Arrays;

public class Solution {
    public String reverseVowels(String s) {
        char[] ctr = s.toCharArray();
        if (s.isBlank() || s.length() < 2) return s;
        if (s.length() == 2) {
            char c = Character.toLowerCase(ctr[0]);
            char t = Character.toLowerCase(ctr[1]);
            if ((c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') && (t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u')) {
                char temp = ctr[0];
                ctr[0] = ctr[1];
                ctr[1] = temp;
                return new String(ctr);
            }
            return s;
        }
        int i = 0, j = s.length() - 1;

        while (true) {
            while (true) {
                char c = Character.toLowerCase(ctr[i]);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    break;
                }
                i++;
                if (i >= j) break;

            }

            while (true) {
                char c = Character.toLowerCase(ctr[j]);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    break;
                }
                j--;
                if (i >= j) break;

            }
            if (i >= j) break;
            char temp = ctr[j];
            ctr[j] = ctr[i];
            ctr[i] = temp;
            i++;
            j--;
        }
        return new String(ctr);
    }

}
