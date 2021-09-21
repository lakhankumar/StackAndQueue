package stack;

public class UC2_PopAndPush {
    private int[] arr;
    private int size;
    private int top;

    public UC2_PopAndPush(int size) {
        this.arr = new int[size];
        this.size = size;
        this.top = -1;
    }

    public void push(int data){
    if(isFull()){
        System.out.println("Stack is full");
        System.exit(1);
    }
    arr[++top] = data;
    }

    public void pop() throws Exception{
        if (isEmpty()){
            throw new Exception("Stack is empty");
        }
        int pop = this.arr[top--];
        System.out.println("this element has been popped: " +pop);
    }

    public int peek() {
        if (!isEmpty()) {
            return arr[top];
        }
        return -1;
    }

    public boolean isFull(){
    return (top == size - 1);
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    void display(){
        for (int i = top; i >= 0; i--) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) throws Exception {
       UC2_PopAndPush uc1_createStack = new UC2_PopAndPush(3);
       uc1_createStack.push(70);
       uc1_createStack.push(30);
       uc1_createStack.push(56);
       uc1_createStack.display();
       uc1_createStack.pop();
       uc1_createStack.display();
       int value = uc1_createStack.peek();
       if (value == -1){
           System.out.println("stack is empty");
       }
       else {
           System.out.println("top element is: " +value);
       }
    }
}
