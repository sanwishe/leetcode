package io.jmz.leetcode.junior.addtwonumbers;

import org.junit.jupiter.api.Test;

class SolutionTest {

    @Test
    void addTwoNumbers() {
        //given
        ListNode l1 = buildTestData(new int[]{2, 1, 3});
        ListNode l2 = buildTestData(new int[]{3, 3, 7});

        Solution solution = new Solution();


        // when
        ListNode res = solution.addTwoNumbers(l1, l2);

        //then
        System.out.println(res.val);
    }

    private ListNode buildTestData(int[] ints) {
        ListNode head = null;
        ListNode cursor = null;

        for (int i = 0; i < ints.length; i++) {
            ListNode node = new ListNode(ints[i]);

            if (head == null && cursor == null) {
                head = cursor = node;
            }

            cursor.next = node;
            cursor = node;
        }

        return head;
    }
}