package hexawareTraining;

import java.util.Scanner;

public class missingValue {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cur_sum = 0;
        int arr[] = new int[n-1];
        for (int i = 0; i < n-1; i++) {
            arr[i] = sc.nextInt();
            cur_sum += arr[i];
        }
        int actual_sum = 0;
        for(int i = 1; i <= n; i++){
            actual_sum += i;
        }
        System.out.println("Required sum: "+ actual_sum);
        System.out.println("current sum: "+ cur_sum);
        System.out.println(Math.abs(actual_sum - cur_sum));
    }
}
