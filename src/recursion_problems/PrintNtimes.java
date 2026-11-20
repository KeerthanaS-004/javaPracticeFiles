package recursion_problems;

import java.util.Scanner;

public class PrintNtimes {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        prt(1, repeat);
    }
    static void prt(int i, int n){
        if(i > n){
            return;
        }
        System.out.println("Keerthana");
        prt(i+1, n);
    }
}
