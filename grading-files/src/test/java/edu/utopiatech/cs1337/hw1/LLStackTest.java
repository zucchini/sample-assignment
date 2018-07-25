package edu.utopiatech.cs1337.hw1;

import org.junit.Before;
import org.junit.Test;

import java.util.NoSuchElementException;

import static org.junit.Assert.*;

public class LLStackTest {
    private StackInterface stack;

    @Before
    public void setUp() throws Exception {
        stack = new LLStack();
    }

    @Test
    public void testSinglePushPop() {
        String tester = "Test string";
        stack.push(tester);
        assertEquals(stack.pop(), tester);
    }

    @Test(expected = NoSuchElementException.class)
    public void testEmptyPopException() {
        stack.pop();
    }

    @Test
    public void testEmptyIsEmpty() {
        assertTrue(stack.isEmpty());
    }

    @Test
    public void testNonEmptyIsEmpty() {
        stack.push("tester");
        assertFalse(stack.isEmpty());
    }

    @Test
    public void testLIFO() {
        String t1 = "t1";
        String t2 = "t2";
        String t3 = "t3";

        stack.push(t1);
        stack.push(t2);
        stack.push(t3);

        assertEquals(stack.pop(), t3);
        assertEquals(stack.pop(), t2);
        assertEquals(stack.pop(), t1);
    }

    @Test
    public void testFullFunctionality() {
        assertTrue(stack.isEmpty());

        String t1 = "t1";
        String t2 = "t2";
        String t3 = "t3";

        stack.push(t1);
        stack.push(t2);
        stack.push(t3);

        assertFalse(stack.isEmpty());

        assertEquals(stack.pop(), t3);
        assertEquals(stack.pop(), t2);
        assertEquals(stack.pop(), t1);

        assertTrue(stack.isEmpty());
    }
}
