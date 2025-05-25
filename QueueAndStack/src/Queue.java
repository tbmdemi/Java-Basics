public class Queue {
    private int front;
    private int rear;
    private int[] arr;
    private int capacity;

    public Queue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = 0;
    }

    // Phương thức thêm phần tử vào queue
    public void push(int value) {
        if (rear == capacity) { // Kiểm tra tràn
            System.out.println("Queue is full.");
            return;
        }
        arr[rear] = value;
        rear++;
    }

    // Phương thức lấy phần tử từ queue
    public int pop() {
        if (front == rear) { // Kiểm tra rỗng
            System.out.println("Queue is empty.");
            return -1; // hoặc ném ngoại lệ
        }
        int value = arr[front];
        front++;
        return value;
    }

    public boolean isEmpty() {
        return front == rear;
    }

    public void printQueue() {
        for (int i = front; i < rear; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
