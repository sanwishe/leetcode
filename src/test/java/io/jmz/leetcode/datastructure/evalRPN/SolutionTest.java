package io.jmz.leetcode.datastructure.evalRPN;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    static Stream<Arguments> argProvide() {
        return Stream.of(
                Arguments.arguments(18, new String[]{"18"}),
                Arguments.arguments(9, new String[]{"2", "1", "+", "3", "*"}),
                Arguments.arguments(6, new String[]{"4", "13", "5", "/", "+"}),
                Arguments.arguments(22, new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "argProvide")
    void evalRPN(Integer value, String[] RPNs) {
        int actual = new Solution().evalRPN(RPNs);

        assertEquals(value, actual);
    }
}