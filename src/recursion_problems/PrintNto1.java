package recursion_problems;

import java.util.Scanner;

public class PrintNto1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        pri(n);
    }
    static void pri(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        pri(n-1);
    }
}
