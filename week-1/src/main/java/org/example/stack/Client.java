package org.example.stack;

import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class Client {

    @Test
    public void test() {
        CustomStack<Integer> stack = new CustomStack<>();

        stack.push(10);
        stack.push(5);
        stack.push(15);

        assertEquals(Optional.of(15).get(), stack.peek());
    }
}
