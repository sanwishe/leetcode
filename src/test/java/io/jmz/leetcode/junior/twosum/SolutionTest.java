package io.jmz.leetcode.junior.twosum;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    @DisplayName("2, 7, 11, 15, target=9")
    void twoSum1() {
        //given
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        //when
        int[] result = new Solution().twoSum(nums, target);

        assertAll("twosum",
                () -> assertEquals(0, result[0]),
                () -> assertEquals(1, result[1])
        );
    }

    @Test
    @DisplayName("2, 7, 15, 18, target=33")
    void twoSum2() {
        //given
        int[] nums = {2, 7, 15, 18};
        int target = 33;

        //when
        int[] result = new Solution().twoSum(nums, target);

        assertAll("twosum",
                () -> assertEquals(2, result[0]),
                () -> assertEquals(3, result[1])
        );
    }
}
