package basicProblems;

import java.util.Scanner;

public class primeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if(n<=1){
            System.out.println("not prime");
            return;
        }
/*
        int countLeaf = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                countLeaf++;
            }
        }
        if(countLeaf == 2){
            System.out.println("PRIME");
        }
        else{
            System.out.println("NOT PRIME");
        }
*/
        //2nd approach
        for(int i = 2; i <= n/2; i++) {
            if (n % i == 0) {
                System.out.println("Not prime");
                return;
                //return podla naa prime neraiye vaati print aagum, return kuduthuta
                //one time print pannitu return aagidum
            }
        }
        //incase the number prime ah irundha mela loop false aagidum , indha block print aagum
        System.out.println("prime");
    }
}
