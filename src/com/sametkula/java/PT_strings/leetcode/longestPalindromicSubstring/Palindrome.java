package com.sametkula.java.PT_strings.leetcode.longestPalindromicSubstring;

public class Palindrome {
    public String longestPalindrome(String s) {
        if (s.length() < 2)
            return s;
        StringBuilder result = new StringBuilder();
        StringBuilder dummy = new StringBuilder();
        int left = 0 , right = 0;

        for (int i = 1; i < s.length(); i++) {
            System.out.println(dummy.toString());
            dummy.delete(0,dummy.length());
            System.out.println(dummy.toString());
            dummy.append(s.charAt(i));
            left = 1;
            right = 1;

            if (s.charAt(i - left) == dummy.charAt(0)){
                dummy.append(s.charAt(i - left));
                left++;
            }
            else if (i + right < s.length() && s.charAt(i + right) == dummy.charAt(0)){
                dummy.append(s.charAt(i + right));
                right++;
            }

            while(isPalindrome(dummy.toString()) && i - left >= 0 && i + right < s.length()) {
                dummy.append(s.charAt(i - left));
                dummy.insert(0,s.charAt(i + right));

                left++;
                right++;
            }
            if (!isPalindrome(dummy.toString())){
                dummy.delete(0 , 1);
                dummy.delete(dummy.length() - 1 , dummy.length());
            }
            if (dummy.length() > result.length()){
                result.delete(0 , result.length());
                result.append(dummy);
                System.out.printf("i = %d; dummy = %s\n", i, dummy.toString());
            }
        }

        return result.toString();
    }
    public boolean isPalindrome(String s) {
        return s.equals(reverseString(s));
    }
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
