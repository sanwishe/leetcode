package io.jmz.leetcode.datastructure.circular;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyCircularQueueTest {

    @Test
    void testQueue() {
        // given
        MyCircularQueue circularQueue = new MyCircularQueue(3); // 设置长度为 3

        // then
        assertAll("官方用例集合",
                () -> assertTrue(circularQueue.isEmpty()),
                () -> assertTrue(circularQueue.enQueue(1)),
                () -> assertTrue(circularQueue.enQueue(2)),
                () -> assertTrue(circularQueue.enQueue(3)),
                () -> assertFalse(circularQueue.enQueue(4)),
                () -> assertEquals(3, circularQueue.Rear()),
                () -> assertTrue(circularQueue.isFull()),
                () -> assertFalse(circularQueue.isEmpty()),
                () -> assertTrue(circularQueue.deQueue()),
                () -> assertTrue(circularQueue.enQueue(4)),
                () -> assertEquals(4, circularQueue.Rear()),
                () -> assertEquals(2, circularQueue.Front())
        );
    }

}