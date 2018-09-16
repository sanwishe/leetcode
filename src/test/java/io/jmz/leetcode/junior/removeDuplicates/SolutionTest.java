package io.jmz.leetcode.junior.removeDuplicates;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    @DisplayName("1,1,2")
    void removeDuplicates1() {
        //given
        int[] nums = new int[]{1, 1, 2};

        //when
        final int res = new Solution().removeDuplicates(nums);

        //then
        assertAll("removeDuplicates",
                () -> assertEquals(res, 2),
                () -> assertEquals(nums[1], 2)
        );

    }

    @Test
    @DisplayName("0,0,1,1,1,2,2,3,3,4,4,5,5,5,5,5")
    void removeDuplicates2() {
        //given
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 5, 5, 5};

        //when
        final int res = new Solution().removeDuplicates(nums);

        //then
        assertAll("removeDuplicates",
                () -> assertEquals(res, 6),
                () -> assertEquals(nums[5], 5)
        );

    }
}