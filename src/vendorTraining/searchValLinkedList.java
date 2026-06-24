package vendorTraining;

import java.util.*;
public class searchValLinkedList {
    class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insert(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newnode;
    }
    public int search(int x){
        Node temp = head;
        int pos = 1 ;

        while(temp.next != null){
            if(temp.data == x){
                return pos;
            }
            temp = temp.next;
            pos++;
        }
        return -1;
    }
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        searchValLinkedList list = new searchValLinkedList();
        for(int i = 0; i < n; i++){
            list.insert(sc.nextInt());
        }
        System.out.println("enter num");
        int x = sc.nextInt();
        int result = list.search(x);
        if(result == -1){
            System.out.println("not found");
        }
        else{
            System.out.println(result);
        }
    }
}
