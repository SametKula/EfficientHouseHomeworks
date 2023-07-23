package com.sametkula.java.test;


import com.sametkula.java.PT_strings.leetcode.longestPalindromicSubstring.Palindrome;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class SolutionTest {
  @Test
  public void test(){
    Palindrome palette = new Palindrome();

    Assertions.assertEquals("iadanadaadaadanadai", palette.longestPalindrome("nmsfdaijbgnhjisadbgfhiadanadaadaadanadaijhsdjsdhhsdhshsdhsddafwerfbv"));
  }
  @Test
  public void test3(){
    Palindrome palette = new Palindrome();

    Assertions.assertEquals("ccc", palette.longestPalindrome("ccc"));
  }

  @Test
  public void test5(){
    Palindrome palette = new Palindrome();

    Assertions.assertEquals("bb", palette.longestPalindrome("bb"));
  }

  @Test
  public void test2(){
    Palindrome palette = new Palindrome();

    Assertions.assertEquals("gykrkyg", palette.longestPalindrome("zudfweormatjycujjirzjpyrmaxurectxrtqedmmgergwdvjmjtstdhcihacqnothgttgqfywcpgnuvwglvfiuxteopoyizgehkwuvvkqxbnufkcbodlhdmbqyghkojrgokpwdhtdrwmvdegwycecrgjvuexlguayzcammupgeskrvpthrmwqaqsdcgycdupykppiyhwzwcplivjnnvwhqkkxildtyjltklcokcrgqnnwzzeuqioyahqpuskkpbxhvzvqyhlegmoviogzwuiqahiouhnecjwysmtarjjdjqdrkljawzasriouuiqkcwwqsxifbndjmyprdozhwaoibpqrthpcjphgsfbeqrqqoqiqqdicvybzxhklehzzapbvcyleljawowluqgxxwlrymzojshlwkmzwpixgfjljkmwdtjeabgyrpbqyyykmoaqdambpkyyvukalbrzoyoufjqeftniddsfqnilxlplselqatdgjziphvrbokofvuerpsvqmzakbyzxtxvyanvjpfyvyiivqusfrsufjanmfibgrkwtiuoykiavpbqeyfsuteuxxjiyxvlvgmehycdvxdorpepmsinvmyzeqeiikajopqedyopirmhymozernxzaueljjrhcsofwyddkpnvcvzixdjknikyhzmstvbducjcoyoeoaqruuewclzqqqxzpgykrkygxnmlsrjudoaejxkipkgmcoqtxhelvsizgdwdyjwuumazxfstoaxeqqxoqezakdqjwpkrbldpcbbxexquqrznavcrprnydufsidakvrpuzgfisdxreldbqfizngtrilnbqboxwmwienlkmmiuifrvytukcqcpeqdwwucymgvyrektsnfijdcdoawbcwkkjkqwzffnuqituihjaklvthulmcjrhqcyzvekzqlxgddjoir"));
  }
  @Test
  public void test4(){
    Palindrome palette = new Palindrome();

    Assertions.assertEquals("a", palette.longestPalindrome("ac"));
  }

}
