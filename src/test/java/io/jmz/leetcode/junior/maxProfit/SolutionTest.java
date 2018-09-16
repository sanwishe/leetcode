package io.jmz.leetcode.junior.maxProfit;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    @DisplayName("7,1,5,3,6,4")
    void maxProfit1() {
        //given
        int[] prices = new int[]{7,1,5,3,6,4};

        //when
        int maxProfit = new Solution().maxProfit(prices);

        //then
        assertEquals(7, maxProfit);
    }

    @Test
    @DisplayName("7,1,5,3,6,4,3,2,5")
    void maxProfit12() {
        //given
        int[] prices = new int[]{7,1,5,3,6,4,3,2,5};

        //when
        int maxProfit = new Solution().maxProfit(prices);

        //then
        assertEquals(10, maxProfit);
    }
}