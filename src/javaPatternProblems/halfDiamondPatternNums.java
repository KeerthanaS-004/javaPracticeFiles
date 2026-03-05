package javaPatternProblems;

import java.util.Scanner;

public class halfDiamondPatternNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no.: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        for (int i = n-1; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
/*
Enter the no :
7
1 2 3 4 5 6 7
  2 3 4 5 6 7
    3 4 5 6 7
      4 5 6 7
        5 6 7
          6 7
            7
          6 7
        5 6 7
      4 5 6 7
    3 4 5 6 7
  2 3 4 5 6 7
1 2 3 4 5 6 7
*/