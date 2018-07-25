package edu.utopiatech.cs1337.hw1;

public interface QueueInterface {
    void enqueue(Object o);
    Object dequeue();
    boolean isEmpty();
}