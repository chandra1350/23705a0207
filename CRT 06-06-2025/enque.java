public class Queue {
    private int[] arr;
    private int front, rear, size, capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        size = 0;
        rear = -1;
    }

    // Add an element to the queue
    public void enqueue(int item) {
        if (size == capacity) {
            System.out.println("Queue is full! Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] = item;
        size++;
        System.out.println(item + " enqueued to queue");
    }

    // Remove an element from the queue
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty! Cannot dequeue.");
            return -1;
        }
        int item = arr[front];
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Check if queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Get the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty! No front element.");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element is: " + queue.peek());

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60); // This should show queue full message

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }

        queue.dequeue(); // Queue empty case
    }
}
