package javaPatternProblems;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("1 ");
            }
            for (int j = 1; j <= i ; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
/*
Enter the number : 7
1 1 1 1 1 1 1
1 1 1 1 1 2 2
1 1 1 1 3 3 3
1 1 1 4 4 4 4
1 1 5 5 5 5 5
1 6 6 6 6 6 6
7 7 7 7 7 7 7
*/