package com.sametkula.java.PT_arrays.leetcode.LetterCombinationsofaPhoneNumber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    /*
    *
    * bunu yapabilmek icin daha kac firin ekmek yemem lazim bilmiyorum ama bayagi yemem lazim simdilik paslaadim sadece TODO diyebilirim
    * */
    public List<String> letterCompinations(String digits){
        var hm = new HashMap<String, String>();
        hm.put("2", "abc");
        hm.put("3", "def");
        hm.put("4", "ghi");
        hm.put("5", "jkl");
        hm.put("6", "mno");
        hm.put("7", "pqrs");
        hm.put("8", "tuv");
        hm.put("9", "wxyz");
        var sb = new StringBuilder();
        var result = new ArrayList<String>();
        // "23"
        for(int i = 0; i < digits.length(); i++){
            for(int j = i + 1; j < digits.length(); j++){
                for(char c : hm.get(String.valueOf(digits.charAt(i))).toCharArray()){
                    for (char ch : hm.get(String.valueOf(digits.charAt(i))).toCharArray()){
                        sb.append(c).append(ch);
                        result.add(sb.toString());
                        sb.delete(0, sb.length());
                    }
                }
            }
        }

        return result;
    }
}
