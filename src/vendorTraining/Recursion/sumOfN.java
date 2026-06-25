package vendorTraining.Recursion;

import java.util.Scanner;

public class sumOfN {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(add(num));
    }
    public static int add(int n){
        if(n == 0){
            return 0;
        }
        return n + add(n - 1);
    }
}
