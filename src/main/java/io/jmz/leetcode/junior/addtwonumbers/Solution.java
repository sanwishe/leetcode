package io.jmz.leetcode.junior.addtwonumbers;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }

        if (l2 == null) {
            return l1;
        }

        ListNode head = null;
        ListNode cursor = null;

        boolean l1_completed = false;
        boolean l2_completed = false;

        int overload = 0;

        for (; ; ) {

            int v1 = l1_completed ? 0 : l1.val;
            int v2 = l2_completed ? 0 : l2.val;

            int sum = v1 + v2 + overload;

            overload = sum / 10;

            int numb = sum % 10;

            ListNode node = new ListNode(numb);

            if (head == null || cursor == null) {
                head = cursor = node;
            }

            cursor.next = node;
            cursor = node;

            l1_completed = l1.next == null;
            l2_completed = l2.next == null;

            if (l1_completed && l2_completed && (overload == 0)) {
                break;
            }

            if (!l1_completed) {
                l1 = l1.next;
            }

            if (!l2_completed) {
                l2 = l2.next;
            }
        }

        return head;
    }
}
