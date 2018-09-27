package io.jmz.leetcode.junior.found_median;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    void findMedianSortedArrays1() {
        //given
        int[] nums1 = new int[]{1, 4, 6, 7};
        int[] nums2 = new int[]{2, 3, 5, 8};
        double expect = 4.5;

        //when
        double act = new Solution().findMedianSortedArrays(nums1, nums2);

        assertEquals(expect, act);
    }

    @Test
    void findMedianSortedArrays2() {
        //given
        int[] nums1 = new int[]{1, 3, 8};
        int[] nums2 = new int[]{2, 4, 5, 7, 9};
        double expect = 4.5;

        //when
        double act = new Solution().findMedianSortedArrays(nums1, nums2);

        assertEquals(expect, act);
    }

    @Test
    void findMedianSortedArrays3() {
        //given
        int[] nums1 = new int[]{2};
        int[] nums2 = new int[]{};
        double expect = 2;

        //when
        double act = new Solution().findMedianSortedArrays(nums1, nums2);

        assertEquals(expect, act);
    }
}
