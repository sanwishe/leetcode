package io.jmz.leetcode.datastructure.minStack;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinStackTest {

    @Disabled
    @Test
    void testMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(-3, minStack.getMin());   //--> 返回 -3.
        minStack.pop();
        assertEquals(0,minStack.top());      //--> 返回 0.
        assertEquals(-2, minStack.getMin());   //--> 返回 -2.
    }
}