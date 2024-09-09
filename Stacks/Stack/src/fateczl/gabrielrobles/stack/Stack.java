package fateczl.gabrielrobles.stack;

import java.util.NoSuchElementException;

/**
 * Represents a stack data structure.
 * 
 * @param <T> the type of elements stored in the stack
 */
public class Stack<T> {
    private T[] elements;
    private int top;

    /**
     * Constructs a new Stack with the specified capacity.
     * 
     * @param capacity the maximum number of elements that the Stack can hold
     */
    @SuppressWarnings("unchecked")
    public Stack(int capacity) {
        elements = (T[]) new Object[capacity];
        top = -1;
    }

    /**
     * Pushes an item onto the top of the stack.
     * 
     * @param item the item to be pushed onto the stack
     * @throws IllegalStateException if the stack is full
     */
    public void push(T item) {
        if (top == elements.length - 1) {
            throw new IllegalStateException("Stack is full");
        }

        elements[++top] = item;
    }

    /**
     * Removes and returns the top element from the stack.
     *
     * @return the top element of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        T item = elements[top];
        elements[top--] = null;
        return item;
    }

    /**
     * Returns the element at the top of the stack without removing it.
     *
     * @return the element at the top of the stack
     * @throws NoSuchElementException if the stack is empty
     */
    public T top() {
        if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }

        return elements[top];
    }

    /**
     * Returns the maximum element in the stack.
     *
     * @return the maximum element in the stack
     * @throws NoSuchElementException if the stack is empty
     * @throws IllegalStateException if the stack is not of type Integer
     */
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

    /**
     * Checks if the stack is empty.
     * 
     * @return true if the stack is empty, false otherwise.
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Returns the size of the stack.
     *
     * @return the size of the stack
     */
    public int size() {
        return top + 1;
    }
}
