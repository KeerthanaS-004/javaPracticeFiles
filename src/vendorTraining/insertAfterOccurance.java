package vendorTraining;

import java.util.Scanner;

public class insertAfterOccurance {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertVal(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public void insertPos(int k, int data){
        if(head == null){
            System.out.println("cant insert..");
        }
        Node temp = head;
        while(temp != null){
            if(temp.data == k){
                Node val = new Node(data);
                val.next = temp.next;
                temp.next = val;
                temp = temp.next;
            }
            else{
                temp = temp.next;
            }
        }
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
    public static void main(String[]args){
        insertAfterOccurance list = new insertAfterOccurance();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            list.insertVal(sc.nextInt());
        }
        System.out.println("Enter occurance: ");
        int k = sc.nextInt();
        System.out.println("What value you want to insert: ");
        int value = sc.nextInt();
        list.insertPos(k, value);
        list.print();
    }
}
