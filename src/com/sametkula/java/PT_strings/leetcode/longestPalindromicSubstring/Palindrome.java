package com.sametkula.java.PT_strings.leetcode.longestPalindromicSubstring;

public class Palindrome {
    public String longestPalindrome(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            StringBuilder sb = new StringBuilder();
            sb.append(s.charAt(i));
            int j = 1;
            while (isPalindrome(sb.toString())){//babad
                if (i - j < 0 || i + j >= s.length())
                    break;
                if (s.charAt(i + j) == s.charAt(i - j)){
                    sb.insert(0,s.charAt(i - j)).append(s.charAt(i + j));
                    j++;
                    continue;
                }
                if(s.charAt(i + j) == s.charAt(i - j + 1))
                    sb.append(s.charAt(i + j));
                if(s.charAt(i - j) == s.charAt(i + j - 1))
                    sb.insert(0,s.charAt(i + j));
                j++;
            }
            if (sb.length() > result.length()){
                result = sb;
                System.out.println(result.toString());
            }
        }
        return result.toString();
    }
    public boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
    public String reverseString(String s) {
        StringBuilder sb = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--)
            sb.append(s.charAt(i));

        return sb.toString();
    }
}
