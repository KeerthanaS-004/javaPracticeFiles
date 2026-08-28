package hexawareTraining;

import java.util.Scanner;

public class bestTimeToBuyAndSale {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        /*int n = sc.nextInt();
        int[] cost = new int[n];*/
        int[] cost = {1, 9, 2, 11, 1, 9, 2};
        int min = Integer.MAX_VALUE;
        int max = 0;
        for(int i = 0; i < cost.length; i++){
            if(cost[i] < min){
                min = cost[i];
            }
            max = Math.max(max, cost[i]-min);
        }
        System.out.println("maximum profit: "+max);
    }
}
