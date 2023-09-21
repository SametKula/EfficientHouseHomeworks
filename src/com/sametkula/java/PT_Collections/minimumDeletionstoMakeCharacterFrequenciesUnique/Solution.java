package com.sametkula.java.PT_Collections.minimumDeletionstoMakeCharacterFrequenciesUnique;


import org.junit.Test;

import java.util.Arrays;

public class Solution {
    public int minDeletions(String s) {
        int[] alphabet = new int[26];
        int result = 0;
        for (char c : s.toCharArray()) {
            alphabet[c - 'a']++;
        }
        Arrays.sort(alphabet);
        System.out.println(Arrays.toString(alphabet));
        for (int i = 25; alphabet[i] != 0; i--) {
            while (alphabet[i] > 0 && Arrays.binarySearch(alphabet, alphabet[i] -1) != -1){
                alphabet[i]--;
                result++;
            }
            System.out.println(Arrays.toString(alphabet));

        }
        return result;
    }
    @Test
    public void test(){
        System.out.println(minDeletions("aaabbbcc"));
    }
}
