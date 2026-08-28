package javaPatternProblems;

import java.util.Arrays;
import java.util.Scanner;

public class fiboPattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int a = 0;
        int b = 1;
        for(int i = 0; i < n; i++){
            int c = a + b;
            arr[i] = c;
            a = b;
            b = c;
        }
        int k = arr.length;
        int p = 1;
        for(int i = 0; i < n; i++){
            for(int j = arr[k-p]; j > 0; j--){
                System.out.print(arr[i]+ " ");
            }
            p++;
            System.out.println();
        }
    }
}
