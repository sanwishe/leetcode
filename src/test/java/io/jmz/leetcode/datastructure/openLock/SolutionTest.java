package io.jmz.leetcode.datastructure.openLock;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    // deadends = ["0201","0101","0102","1212","2002"], target = "0202"
    @Test
    void openLock1() {
        // given
        String[] deadends = new String[]{"0201", "0101", "0102", "1212", "2002"};
        String target = "0202";

        // when
        int actual = new Solution().openLock(deadends, target);


        //then
        assertEquals(6, actual);
    }

    // deadends = ["8888"], target = "0009"
    @Test
    void openLock2() {
        // given
        String[] deadends = new String[]{"8888"};
        String target = "0009";

        // when
        int actual = new Solution().openLock(deadends, target);


        //then
        assertEquals(1, actual);
    }

    // deadends = ["8887","8889","8878","8898","8788","8988","7888","9888"], target = "8888"
    @Test
    void openLock3() {
        // given
        String[] deadends = new String[]{"8887","8889","8878","8898","8788","8988","7888","9888"};
        String target = "8888";

        // when
        int actual = new Solution().openLock(deadends, target);


        //then
        assertEquals(-1, actual);
    }

    // deadends = ["0000"], target = "8888"
    @Test
    void openLock4() {
        // given
        String[] deadends = new String[]{"0000"};
        String target = "8888";

        // when
        int actual = new Solution().openLock(deadends, target);


        //then
        assertEquals(-1, actual);
    }
}