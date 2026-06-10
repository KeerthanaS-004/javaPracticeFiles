package basicProblems;

import java.util.Scanner;

public class oddEvenUsingXOR {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the instfirst integer: ");
        int a = sc.nextInt(); // a = 6
        //condition for checking even
        // XOR operation
        if(a < (a^1)){ // a^1 ==> 6^1 = 7 , a = 6 , here a < a^1 so it is even
            System.out.println("The instfirst integer is even");
        }
        else{
            System.out.println("The instfirst integer is odd");
        }
        System.out.println("Enter the 2nd integer: ");
        int b = sc.nextInt(); // b = 5
        //condition for checking odd
        if(b > (b^1)){ // b^1 ==> 5^1 = 4 , b = 5 , here b > b^1 so it is odd
            System.out.println("The 2nd integer is odd");
        }
        else{
            System.out.println("The 2nd integer is even");
        }
    }
}
