package basicProblems;

import java.util.Scanner;

public class printingPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 2) {
                System.out.println(i);
                primeCount++;
            }
        }
        System.out.println("Total of Prime numbers : "+ primeCount);
    }
}
/*
Enter a number: 7
2
3
5
7
Total of Prime numbers : 4
 */