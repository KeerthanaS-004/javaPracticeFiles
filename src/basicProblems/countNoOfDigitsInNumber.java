package basicProblems;

import java.util.Scanner;

public class countNoOfDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
//        for ( ; n != 0 ; n=n/10) {
//            countLeaf++;
//        }
        System.out.println(count);
    }
}
/*
Enter a number :
2587469
7
*/