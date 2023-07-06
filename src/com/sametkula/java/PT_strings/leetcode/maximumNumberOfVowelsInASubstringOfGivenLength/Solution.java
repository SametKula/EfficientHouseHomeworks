package com.sametkula.java.PT_strings.leetcode.maximumNumberOfVowelsInASubstringOfGivenLength;

public class Solution {
    public int maxVowels(String s, int k){
        int temp = 0;
        char[] sc = s.toCharArray();
        s = null;

        for (int i = 0; i < k; i++)
            if (isVowel(sc[i]))
                temp++;

        int max = temp;
        for (int i = k; i < sc.length; i++){
            if (isVowel(sc[i - k]))
                temp--;
            if (isVowel(sc[i]))
                temp++;

            max = Math.max(max, temp);
        }
        return max;
    }
    private boolean isVowel(char ch){
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

}
