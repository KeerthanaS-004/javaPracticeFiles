package vendorTraining;

import java.util.*;

public class prioQueue {
    public static void main(String[] args) {
//        int []a = {3, 5, 1, 6, 7, 4, 8, 9};
        int [] a ={8, 7, 7, 8, 0, 7, 7, 3, 7 ,4};
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i : a){
            pq.add(i);
        }
        System.out.println(pq);
        while(!pq.isEmpty()){
            System.out.print(pq.poll() + " ");
        }
    }
}
