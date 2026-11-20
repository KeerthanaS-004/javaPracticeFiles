package recursion_problems;

import java.util.Scanner;

public class Print1toN {
    static void f(int i, int n){
        if(i > n){
            return;
        }
        System.out.println(i);
        f(i + 1, n);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        f(1, n);
    }
}
