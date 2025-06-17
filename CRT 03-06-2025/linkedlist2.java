public class LinkedListProgram {
    
    // Node class
    static class Node {
        int data;
        Node next;

        // Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Linked List class
    static class LinkedList {
        Node head;

        // Insert a new node at the end
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

        // Delete a node by value
        public void delete(int key) {
            Node current = head;
            Node prev = null;

            // If head holds the key
            if (current != null && current.data == key) {
                head = current.next;
                return;
            }

            // Search for the key
            while (current != null && current.data != key) {
                prev = current;
                current = current.next;
            }

            // If key not found
            if (current == null) {
                System.out.println("Value " + key + " not found.");
                return;
            }

            // Remove the node
            prev.next = current.next;
        }

        // Display the list
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    // Main method
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert elements
        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        System.out.println("Linked List after insertion:");
        list.display();  // Output: 5 -> 10 -> 15 -> 20 -> null

        // Delete an element
        list.delete(10);
        System.out.println("Linked List after deleting 10:");
        list.display();  // Output: 5 -> 15 -> 20 -> null

        // Try deleting a non-existent element
        list.delete(100);  // Output: Value 100 not found.
    }
}
