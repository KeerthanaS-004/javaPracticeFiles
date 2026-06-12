package vendorTraining;
import java.util.*;
public class queueUsingArr {
    static class Queue{
        int capacity;
        int data;
        int[] arr;
        int  front;
        int rear;
        int limit;
        public Queue(int size){
            this.arr = new int[size];
            capacity = size;
            front = 0; //starting position of queue, always on 0
            rear = -1;
            limit = 0;
        }
        public void enqueue(int data){
            if(rear == capacity-1){
                System.out.println("queue is full!!");
                return;
            }
            rear++;
            arr[rear] = data;
            limit++; //To calculate the limit, after storing value the limit is incremented
        }
        public int dequeue(){
            if(rear == -1){
                System.out.println("queue is empty!!");
            }
            int temp = arr[front];
            front++;
            return temp;
        }
        public void peek(){
            if(rear == -1){
                System.out.println("queue is empty!!");
            }
            System.out.print( "The first value in the queue is : "+ arr[front]);
        }
        boolean isFull(){
            return (rear == capacity-1);
        }
        public void search (int val){
            if(rear == -1){
                System.out.println("queue is empty, you can't search");
            }
            for(int i=0; i<=rear; i++){
                if(arr[i] == val){
                    System.out.println("The value is in " + i + " position");
                    return;
                }
                else{
                    System.out.println("value not found");
                    return;
                }
            }
        }
        public void print(){
            if(rear == -1){
                System.out.println("queue is empty!!");
            }
            for(int i = front; i < capacity; i++){
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        public void priorityQueue(){
            int[] mini =  new int[limit];
            int[] maxi =  new int[limit];
            int k = 0;
            for(int i=0; i<limit; i++){
                mini[k] = arr[i];
                k++;
            }
            for (int i = 0; i < limit; i++) {
                for (int j = i+1; j < limit; j++) {
                    if (mini[i] > mini[j]) {
                        int temp = mini[i];
                        mini[i] = mini[j];
                        mini[j] = temp;
                    }
                }
            }
            System.out.println("min heap: " + Arrays.toString(mini));
            int j = 0;
            for (int i = limit-1; i >= 0; i--) {
                maxi[j] += mini[i];
                j++;
            }
            System.out.println("max heap: " + Arrays.toString(maxi));
        }
    }
    public static void main(String[] args) {
//        queueUsingArr obj = new queueUsingArr();
        Queue q = new Queue(7); //static use panranaala direct ah we creating obj for sub class
        q.enqueue(7);
        q.enqueue(2);
        q.enqueue(100);
        q.enqueue(4);
        q.enqueue(3);
        q.enqueue(5);
        q.enqueue(6);
//        q.enqueue(7);
//        q.dequeue();
        q.print();
//        q.search(1);
        q.priorityQueue();
    }
}
