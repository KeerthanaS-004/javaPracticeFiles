package basicProblems;

import java.util.Scanner;

public class countNumsOfVowelsString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String word = sc.nextLine().toLowerCase();
//        int  countLeaf = 0;
//        for (int i = 0; i < word.length(); i++) {
//            char ch =  word.charAt(i);
//            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
//                countLeaf++;
//            }
//        }
//        System.out.println("No. of vowels: " + countLeaf);
        System.out.print("Vowels present in the word : ");
        for (int i = 0; i < word.length(); i++) {
            char ch =  word.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print(" "+ch);
            }
        }
    }
}
