package io.jmz.leetcode.datastructure.minStack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinStackTest {

    @Test
    void testMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);

        assertEquals(-3, minStack.getMin());   //--> 返回 -3.
        minStack.pop();
        assertEquals(0, minStack.top());      //--> 返回 0.
        assertEquals(-2, minStack.getMin());   //--> 返回 -2.
    }

//    ["MinStack","push","push","push","top","pop","getMin","pop","getMin","pop","push","top","getMin","push","top","getMin","pop","getMin"]
//    [[],[2147483646],[2147483646],[2147483647],[],[],[],[],[],[],[2147483647],[],[],[-2147483648],[],[],[],[]]
    @Test
    void testMinStack1() {
        MinStack minStack = new MinStack();
        minStack.push(2147483646);
        minStack.push(2147483646);
        minStack.push(2147483647);

        assertEquals(2147483647, minStack.top());
        minStack.pop();

        assertEquals(2147483646, minStack.getMin());
        minStack.pop();
        minStack.push(2147483647);
        assertEquals(2147483647, minStack.top());
        assertEquals(2147483646, minStack.getMin());
        minStack.push(-2147483648);

        assertEquals(-2147483648, minStack.top());
        assertEquals(-2147483648, minStack.getMin());
        minStack.pop();
        assertEquals(2147483646, minStack.getMin());
    }
}