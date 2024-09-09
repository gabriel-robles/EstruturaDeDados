package fateczl.gabrielrobles.stack;

import java.util.NoSuchElementException;

public class Stack<T> {
    private T[] elements;
    private int top;

    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        elements = (T[]) new Object[capacity];
        top = -1;
    }

    public void push(T item) {
        if (top == elements.length - 1) {
            throw new IllegalStateException("Stack is full");
        }
        elements[++top] = item;
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        T item = elements[top];
        elements[top--] = null;
        return item;
    }

    public T top() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return elements[top];
    }

    public int max() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        var type = elements[0].getClass();

        if (type != Integer.class) {
            throw new IllegalStateException("Stack must be of type Integer");
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= top; i++) {
            if ((int) elements[i] > max) {
                max = (int) elements[i];
            }
        }
        
        return max;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public int size() {
        return top + 1;
    }
}
