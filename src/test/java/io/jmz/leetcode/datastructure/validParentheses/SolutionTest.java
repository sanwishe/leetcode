package io.jmz.leetcode.datastructure.validParentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @ParameterizedTest
    @MethodSource(value = "paramProvide")
    void isValid(String input, boolean expect) {
        boolean actual = new Solution().isValid(input);

        assertEquals(expect, actual);
    }

    static Stream<Arguments> paramProvide() {
        return Stream.of(
                Arguments.arguments("){", false),
                Arguments.arguments("()", true),
                Arguments.arguments("()[]{}", true),
                Arguments.arguments("(]", false),
                Arguments.arguments("{[]}", true),
                Arguments.arguments("([)]", false),
                Arguments.arguments("(8)*", false),
                Arguments.arguments("({[()}()}]", false)
        );
    }
}