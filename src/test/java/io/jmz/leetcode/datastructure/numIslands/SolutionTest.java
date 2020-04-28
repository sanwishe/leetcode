package io.jmz.leetcode.datastructure.numIslands;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void numIslands1() {
        //given
        //        11110
        //        11010
        //        11000
        //        00000
        char[][] grid = {
                {'1', '1', '1', '1', '1'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };

        //when
        int islands = new Solution().numIslands(grid);

        //then
        assertEquals(1, islands);
    }

    @Test
    void testNumIslands2() {
        //given
        //        11000
        //        11000
        //        00100
        //        00011
        char[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        //when
        int islands = new Solution().numIslands(grid);

        //then
        assertEquals(3, islands);
    }

    @Test
    void testNumIslands3() {
        //given
        //        11001
        //        11001
        //        00111
        //        00100
        char[][] grid = {
                {'1', '1', '0', '0', '1'},
                {'1', '1', '0', '0', '1'},
                {'0', '0', '1', '1', '1'},
                {'0', '0', '1', '0', '0'}
        };

        //when
        int islands = new Solution().numIslands(grid);

        //then
        assertEquals(2, islands);
    }

    @Test
    void testNumIslands4() {
        //given
        //        11111
        //        10001
        //        10001
        //        11110
        char[][] grid = {
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '0', '1'},
                {'1', '0', '0', '0', '1'},
                {'1', '1', '1', '1', '0'}
        };

        //when
        int islands = new Solution().numIslands(grid);

        //then
        assertEquals(1, islands);
    }
}