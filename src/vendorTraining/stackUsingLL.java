//incomplete
package vendorTraining;

public class stackUsingLL {
    static class Stack {
        int data;
        Stack next;
        Stack(int data){
            this.data = data;
            this.next = null;
        }
    }
    Stack head;
    public void push(int data){
        Stack stack = new Stack(data);
        if(head == null){
            head = stack;
        }
        Stack temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = stack;
    }
    public void print(){
        Stack n = head;
        while(n!=null){
            System.out.println(n.data+" ");
            n = n.next;
        }
    }
    public static void main(String[] args) {
        stackUsingLL stk = new stackUsingLL();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.print();
    }
}
