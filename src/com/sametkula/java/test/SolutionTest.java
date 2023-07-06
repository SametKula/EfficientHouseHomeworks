package com.sametkula.java.test;

import com.sametkula.java.PT_strings.leetcode.maximumNumberOfVowelsInASubstringOfGivenLength.Solution;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

public class SolutionTest {

    @Test
    public void maxVowels() throws Exception {
        Solution solution = new Solution();

        Assertions.assertEquals(3, solution.maxVowels("abciiidef",3));
        Assertions.assertEquals(4, solution.maxVowels("weallloveyou",7));
    }

}
