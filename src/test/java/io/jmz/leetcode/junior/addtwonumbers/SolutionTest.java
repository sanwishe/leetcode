package io.jmz.leetcode.junior.addtwonumbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @ParameterizedTest
    @CsvSource({
            "{1 3 5 6 3},{3 7 3 9},{4 0 9 5 4}",
            "{2 1 3},{3 3 7},{5 4 0 1}",
            "{1},{3 2 7},{4 2 7}",
            "{2 4 3},{5 6 4},{7 0 8}"
    })
    void parameterizedTestSolution(String sl1, String sl2, String sExpect) {
        //given
        ListNode l1 = convert2ListNode(sl1);
        ListNode l2 = convert2ListNode(sl2);

        ListNode expect = convert2ListNode(sExpect);


        //when
        ListNode actual = new Solution().addTwoNumbers(l1, l2);

        //then
        while (actual != null) {
            assertEquals(actual.val, expect.val);
            actual = actual.next;
            expect = expect.next;
        }
    }

    private ListNode convert2ListNode(String sl) {
        ListNode head = null;
        ListNode cursor = null;

        if (sl.length() <= 0) {
            return null;
        }

        sl = sl.substring(1, sl.length() - 1);
        String[] sls = sl.split(" ");

        for (String s : sls) {
            if (s.length() < 0 || s.length() > 2) {
                throw new RuntimeException("wrong input");
            }

            int num = Integer.parseInt(s, 10);

            ListNode node = new ListNode(num);

            if (head == null || cursor == null) {
                head = cursor = node;
            } else {
                cursor.next = node;
                cursor = node;
            }
        }

        return head;
    }
}