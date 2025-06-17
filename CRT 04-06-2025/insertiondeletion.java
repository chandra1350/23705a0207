public class LinkedListProgram {
    
    
    static class Node {
        int data;
        Node next;

        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    
    static class LinkedList {
        Node head;

    
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

        
        public void delete(int key) {
            Node current = head;
            Node prev = null;
            
            if (current != null && current.data == key) {
                head = current.next;
                return;
            }
            
            
            while (current != null && current.data != key) {
                prev = current;
                current = current.next;
            }

    
            if (current == null) {
                System.out.println("Value " + key + " not found.");
                return;
            }

            
            prev.next = current.next;
        }

        
        public void display() {
            Node current = head;
            while (current != null) {
                System.out.print(current.data + " - ");
                current = current.next;
            }
            System.out.println("null");
        }
    }

    
    public static void main(String[] args) {
        LinkedList list = new LinkedList();


        list.insert(5);
        list.insert(10);
        list.insert(15);
        list.insert(20);
        System.out.println("Linked List after insertion:");
        list.display();  
        
        list.delete(10);
        System.out.println("Linked List after deleting 10:");
        list.display();

        
        list.delete(100);  
    }
}
