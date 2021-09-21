package stack;

public class UC1_CreateStack {
    private int[] arr;
    private int size;
    private int top;

    public UC1_CreateStack(int size) {
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }
    public void push(int data){
    if(isFull()){
        System.out.println("Stack is full");
        System.exit(1);
    }
    arr[++top]=data;
    }
    public boolean isFull(){
    return (top == size - 1);

    }
    void display(){
        for (int i = arr.length-1; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
       UC1_CreateStack uc1_createStack = new UC1_CreateStack(3);
       uc1_createStack.push(70);
       uc1_createStack.push(30);
       uc1_createStack.push(56);
       uc1_createStack.display();
    }
}
