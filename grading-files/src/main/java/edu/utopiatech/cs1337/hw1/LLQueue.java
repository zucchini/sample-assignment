package edu.utopiatech.cs1337.hw1;

import java.util.LinkedList;

public class LLQueue implements QueueInterface {
    private LinkedList backingLL;

    public LLQueue() {
        backingLL = new LinkedList();
    }

    @Override
    public void enqueue(Object o) {
        backingLL.add(o);
    }

    @Override
    public Object dequeue() {
        return backingLL.remove();
    }

    @Override
    public boolean isEmpty() {
        return backingLL.isEmpty();
    }
}
