package io.jmz.leetcode.datastructure;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyCircularQueueTest {

    @Test
    void testQueue() {
        // given
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3

        // then
        assertEquals(true, circularQueue.isEmpty());

        assertEquals(true,  circularQueue.enQueue(1));  // 返回 true

        assertEquals(true,  circularQueue.enQueue(2));  // 返回 true

        assertEquals(true,  circularQueue.enQueue(3));  // 返回 true

        assertEquals(false,  circularQueue.enQueue(4));  // 返回 false，队列已满

        assertEquals(3,  circularQueue.Rear());  // 返回 3

        assertEquals(true,  circularQueue.isFull());  // 返回 true

        assertEquals(false, circularQueue.isEmpty());

        assertEquals(true,  circularQueue.deQueue());  // 返回 true

        assertEquals(true,  circularQueue.enQueue(4));  // 返回 true

        assertEquals(4,  circularQueue.Rear());  // 返回 4

        assertEquals(2, circularQueue.Front());
    }

}