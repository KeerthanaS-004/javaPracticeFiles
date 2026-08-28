package javaPatternProblems;

import java.util.Scanner;

public class FloydTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int num = 1;
        for (int i = 1; i <= n; i++) {
            if(i%2==0){
                int a = num+i-1;
                for(int j = 1; j<=i; j++){
                    System.out.print(a+"  ");
                    a--;
                    num++;
                }
            }
            else{
                for (int j = 1; j <= i ; j++) {
                    System.out.print(num+"  ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
/*
Enter the number: 5
1
3  2
4  5  6
10  9  8  7
11  12  13  14  15
 */