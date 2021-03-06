package queue;

public class UC2_Dequeue {
    private int[] arr;
    private int size;
    private int rear;
    private int capacity;
    private int front;
    private int count;

    public UC2_Dequeue(int size) {
        this.arr = new int[size];
        this.size = size;
        this.rear = -1;
        this.capacity = size;
        this.front = 0;
        this.count = 0;
    }
    public void enqueue(int i) {
    if (isFull()){
        System.out.println("Queue is full");
        System.exit(1);
    }
    rear = (rear+1)%capacity;
    arr[rear] = i;
    count++;
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
        }
        int value = arr[front];
        System.out.println("Dequeue value: " + value);
        front = (front+1)%capacity;
        count--;
    }

    public int size(){
       return count;
    }
    public boolean isFull(){
        return (size() == capacity);
    }

    public boolean isEmpty(){
        return (rear == -1);
    }

    public void display(){
        for (int i = front; i < size; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        UC2_Dequeue uc1_createQueue = new UC2_Dequeue(3);
        uc1_createQueue.enqueue(70);
        uc1_createQueue.enqueue(30);
        uc1_createQueue.enqueue(56);
        uc1_createQueue.display();
        uc1_createQueue.dequeue();
        uc1_createQueue.display();
    }


}
