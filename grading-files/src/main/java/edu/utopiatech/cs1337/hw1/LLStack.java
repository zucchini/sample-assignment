package edu.utopiatech.cs1337.hw1;

import java.util.EmptyStackException;
import java.util.LinkedList;
import java.util.NoSuchElementException;

public class LLStack implements StackInterface {
    private LinkedList backingLL;

    public LLStack() {
        backingLL = new LinkedList();
    }

    @Override
    public void push(Object o) {
        backingLL.push(o);
    }

    @Override
    public Object pop() {
        try {
            return backingLL.pop();
        } catch (EmptyStackException e) {
            throw new NoSuchElementException();
        }
    }

    @Override
    public boolean isEmpty() {
        return backingLL.isEmpty();
    }
}
