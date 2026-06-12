package vendorTraining;
//incomplete
public class stackUsingArr {
    class stack {
        private int top;
        private int capacity;
        private int a[];

        stack(int size) {
            a = new int[size];
            capacity = size;
            top = -1;
        }
        public void push(int data) {
            if (isFull()) {
                System.out.println("stack is full");
                return;
            }
            a[++top] = data;
        }

        boolean isFull() {
            return top == capacity - 1;
        }

        boolean isEmpty() {
            return top == -1;
        }
        public void pop() {
            if (isEmpty()) {
                System.out.println("stack is empty");
                return;
            }
//            a[top--] = a[top];
        }

    }
    public static void main(String[] args) throws Exception {
        stackUsingArr stk = new stackUsingArr();

    }
}
