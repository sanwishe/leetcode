package io.jmz.leetcode.datastructure.numSquares;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @CsvSource({
            "12,  3",
            "30,  3",
            "100, 1",
            "3,   3",
            "13,  2",
            "111, 4"
    })
    void numSquares(int n, int expect) {
        //when
        int actual = new Solution().numSquares(n);


        //then
        assertEquals(expect, actual);
    }
}