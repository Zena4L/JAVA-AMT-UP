package org.example.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class CustomStack<T> {
    private List<T> stack;

    public CustomStack() {
        stack = new ArrayList<>();
    }

    public void push(T element) {
        stack.add(element);
    }

    public T pop() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }
        return stack.removeLast();
    }


    public T peek() {
        if (stack.isEmpty()) {
            throw new EmptyStackException();
        }

        return stack.getLast();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void clear() {
        stack.clear();
    }

}
