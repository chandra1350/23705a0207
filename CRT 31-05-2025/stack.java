 import java.util.EmptyStackException;

public class Stack<T> {
    // Node class to store stack elements
    private static class Node<T> {
        private T data;
        private Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }

    private Node<T> top;

    // Push an element onto the stack
    public void push(T data) {
        Node<T> node = new Node<>(data);
        node.next = top;
        top = node;
    }

    // Pop an element from the stack
    public T pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        T data = top.data;
        top = top.next;
        return data;
    }

    // Peek at the top element of the stack
    public T peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return top.data;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == null;
    }

    // Main method to demonstrate stack usage
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        System.out.println("Pushing 10, 20, 30 onto stack.");
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element is: " + stack.peek()); // 30
        System.out.println("Popped: " + stack.pop());          // 30
        System.out.println("Top after pop: " + stack.peek());  // 20
        System.out.println("Is stack empty? " + stack.isEmpty()); // false

        stack.pop(); // Removes 20
        stack.pop(); // Removes 10

        System.out.println("Is stack empty now? " + stack.isEmpty()); // true
    }
}
