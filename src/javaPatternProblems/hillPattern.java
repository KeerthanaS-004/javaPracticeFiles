package javaPatternProblems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class hillPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns: ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            for(int j=1;j<i;j++){ //or for(int j=2;j<=i;j++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
/*
         *
       * * *
     * * * * *
   * * * * * * *
 * * * * * * * * *
*/
