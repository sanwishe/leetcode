package io.jmz.leetcode.datastructure.openLock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    static Stream<Arguments> argumentsProvide() {
        return Stream.of(
                Arguments.arguments(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202", 6),
                Arguments.arguments(new String[]{"8888"}, "0009", 1),
                Arguments.arguments(new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"}, "8888", -1),
                Arguments.arguments(new String[]{"0000"}, "8888", -1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "argumentsProvide")
    void aggretedTestcase(String[] deadends, String target, int expect) {
        int actual = new Solution().openLock(deadends, target);

        assertEquals(expect, actual);
    }
}