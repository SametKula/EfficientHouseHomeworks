package com.sametkula.java.PT_arrays.leetcode.extraCharactersinaString;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.Arrays;
import java.util.List;

public class Solution {
    @Test
    public void test(){
        Assertions.assertEquals(1,minExtraChars("leetscode", new String[] {"leet","code","leetcode"}) );
    }
    //Todo this is not working
    public int minExtraChars(String s, String[] dictionary){
        int min = Integer.MAX_VALUE;
        for (String word: dictionary) {
            int count = 0;
            int i = 0;
            int j = 0;
            while (i < s.length() && j < word.length()){
                if(s.charAt(i) == word.charAt(j)){
                    i++;
                    j++;
                }else{
                    count++;
                    i++;
                }
            }
            if(j == word.length()){
                min = Math.min(min, count);
            }
        }
        return min;
    }
}
