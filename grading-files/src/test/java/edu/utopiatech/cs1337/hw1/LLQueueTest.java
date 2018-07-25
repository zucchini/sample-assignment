package edu.utopiatech.cs1337.hw1;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LLQueueTest {
    private QueueInterface queue;

    @Before
    public void setUp() throws Exception {
        queue = new LLQueue();
    }

    @Test
    public void testSingleEnqueueDequeue() {
        String tester = "Test string";
        queue.enqueue(tester);
        assertEquals(queue.dequeue(), tester);
    }

    @Test(expected = NoSuchElementException.class)
    public void testEmptyDequeueException() {
        queue.dequeue();
    }

    @Test
    public void testEmptyIsEmpty() {
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testNonEmptyIsEmpty() {
        queue.enqueue("tester");
        assertFalse(queue.isEmpty());
    }

    @Test
    public void testFIFO() {
        String t1 = "t1";
        String t2 = "t2";
        String t3 = "t3";

        queue.enqueue(t1);
        queue.enqueue(t2);
        queue.enqueue(t3);

        assertEquals(queue.dequeue(), t1);
        assertEquals(queue.dequeue(), t2);
        assertEquals(queue.dequeue(), t3);
    }

    @Test
    public void testFullFunctionality() {
        assertTrue(queue.isEmpty());

        String t1 = "t1";
        String t2 = "t2";
        String t3 = "t3";

        queue.enqueue(t1);
        queue.enqueue(t2);
        queue.enqueue(t3);

        assertFalse(queue.isEmpty());

        assertEquals(queue.dequeue(), t1);
        assertEquals(queue.dequeue(), t2);
        assertEquals(queue.dequeue(), t3);

        assertTrue(queue.isEmpty());
    }
}
