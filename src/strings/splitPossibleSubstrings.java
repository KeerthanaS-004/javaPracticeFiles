package strings;

import java.util.Scanner;

public class splitPossibleSubstrings {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the strinb: ");
        String str = sc.nextLine();
        System.out.println("Number of substrings: ");
        splitting(str);
    }
    static void splitting(String str){
        int n = str.length();
        for (int i=0;i<n;i++){
            System.out.println(str.charAt(i));
        }
        for (int i = 0; i <n; i++){
            for (int j = i+1;j<n;j++){
                System.out.println(""+str.charAt(i)+str.charAt(j));
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    System.out.println(""+str.charAt(i)+str.charAt(j)+str.charAt(k));
                }
            }
        }
        System.out.println(str);
    }
}
