package vendorTraining;

public class singlyLinkedList {
    //Node creation
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    //initialise head
    Node head;
    //Insert at instfirst
    public void instfirst(int data){
        Node n = new Node(data); //n is new node , that we gonna instpos at instfirst
        n.next = head;
        head = n;
        return;
    }
    //Insert at instlast
    public void instlast(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
    }
    //Insert at position
    public void instpos(int data, int pos){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        Node temp = head;
        for(int i = 1;i < pos-1;i++){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;
    }
    //Delete at first
    public void delfirst(){
        if(head == null){
            System.out.println("Cannot delete from empty list");
        }
        head = head.next;
    }
    //Delect at last
    public void dellast(){
        if(head == null){
            System.out.println("Cannot delete from empty list");
        }
        Node temp = head;
        while(temp.next.next != null){ //to traverse till the end
            temp = temp.next;
        }
        temp.next = null;
    }
    //Delete at position
    public void delpos(int pos){
        if(head == null){
            System.out.println("Cannot delete from empty list");
        }
        Node temp = head;
        for(int i = 1;i < pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    //To search if the value present or not
    public boolean search(int data){
        Node temp = head;
        if(head == null){
            System.out.println("You cant search from empty list");
        }
        while(temp!= null){
            if(temp.data == data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    //To print the values inserted
    public void print(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println("NULL");
    }
/*    public void reverse(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        for(int i = size-1;i>0;i--){
            System.out.println(temp.data+" ");
        }
    }*/
    public static void main(String[] args) {
        singlyLinkedList list = new singlyLinkedList();
        list.instfirst(4);
        list.instfirst(3);
        list.instfirst(2);
        list.instfirst(1);
        list.instlast(5);
        list.instlast(6);
        list.instpos(55,2);
//        list.dellast();
//        list.delfirst();
        list.delpos(3);
//        list.reverse();
        list.print();
        System.out.println(list.search(4));
    }
}
