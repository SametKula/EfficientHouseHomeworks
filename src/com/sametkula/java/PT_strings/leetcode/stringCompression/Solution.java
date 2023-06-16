package com.sametkula.java.PT_strings.leetcode.stringCompression;


import java.util.Arrays;

public class Solution {
    public int compress(char[] chars){
        StringBuilder sb = new StringBuilder();
        char current = chars[0];
        int count = 1;
        for(int i = 1; i < chars.length; i++){
            if (current == chars[i]) {
                count++;
                continue;
            }
            else {
                sb.append(current);
                current = chars[i];
                if (count == 1) {
                    count = 1;
                    continue;
                }
                sb.append(count);
                count = 1;
            }
        }
        sb.append(current);
        if (count != 1) {
            sb.append(count);
        }
        String s = new String(sb);

        int k = 0;
        for(char c : s.toCharArray()) {
            chars[k++] = c;
        }

        return s.length();
    }
}
