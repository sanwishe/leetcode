package io.jmz.leetcode.junior.longestPalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "cbbd, bb",
            "babad, bab",
            "badiedelsesle, elsesle",
            "bb, bb",
            "abcd, a",
            ","
    })
    void longestPalindrome(String given, String expect) {
        String act = new Solution().longestPalindrome(given);

        assertEquals(act, expect);
    }
}
