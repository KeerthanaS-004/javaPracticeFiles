package stack;

public class implementationOfStack {
    int size = 10;
    int [] stack = new int [size];
    int top = -1;
    void push(int a){
        if(top == size-1){
            System.out.println("Stack overflow");
        }
        else{
            stack[++top] = a;
            System.out.println(stack[top]);
        }
    }
    void pop() {
        int x ;
        if (top == -1) {
            System.out.println("Stack underflow");
        } else {
            x = stack[top--];
            System.out.println("Element popped from the stack: " + x);
        }
    }
    public static void main(String[] args) {
        implementationOfStack obj = new implementationOfStack();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4);
        obj.pop();
    }
}
