package com.sametkula.java.PT_arrays.leetcode.zigzagConversion;

public class Solution {
    public String convert(String input,int numRows){
        if (numRows == 1) return input;
        var output = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++){
            output[i] = new StringBuilder();
        }
        int row = 0 , direction = 1;
        for (int i = 0; i < input.length(); i++){
            output[row].append(input.charAt(i));
            row += direction;
            if (row == numRows - 1 || row == 0){
                direction *= -1;
            }
        }
        var result = new StringBuilder();
        for (var sb : output) {
            result.append(sb);
        }
        return result.toString();
    }
}
