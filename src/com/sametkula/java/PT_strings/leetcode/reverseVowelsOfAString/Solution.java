package com.sametkula.java.PT_strings.leetcode.reverseVowelsOfAString;

import java.util.Arrays;

public class Solution {
    public String reverseVowels(String s) {
        char[] ctr = s.toCharArray();
        if (s.isBlank() || s.length() < 2) return s;
        if (s.length() == 2) {
            if (isVowel(ctr[0]) && isVowel(ctr[1])) {
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
                if (isVowel(ctr[j])) {
                    break;
                }
                i++;
                if (i >= j) break;

            }

            while (true) {
                if (isVowel(ctr[j])) {
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
    private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
