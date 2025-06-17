public class Main {
    public static void main(String[] args) {
        Node head = new Node(data:10);
        Node node1 = new Node(data:20);
        Node node1 = new Node(data:30);
        Node node1 = new Node(data:40);
        head.next = node_1;
        node_1.next = node_2;
        node_2.next = node_3;
        Node temp = head;
        while(temp!=null {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
        }
        class Node{
            int data;
            Node next;
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        class LinkedList {
            Node head;
            LinkedList() {
                this.head = null;
            }
            void insertingBeg(int data) {
                Node newNode = new Node(data);
                newNode.next = head;
                head = newNode;
            }
            Void insertEnd(int data) {
                Node newNode = new Noode(data);
                if(head=newNode);
                return;
            }
            Var temp= head;
            while(temp.next!=null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        }
    }