package strings;

import java.util.Scanner;

public class findFirstSecThirdOccurance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Enter the character: ");
        char ch = sc.next().charAt(0);
        occurance(s, ch);

    }
    static void occurance(String str, char ch) {
        int first = str.indexOf(ch);
        int second = str.indexOf(ch, first + 1);
        int third = str.indexOf(ch, second + 1);
        System.out.println("First Occurance of"+" "+ ch +" "+ "is"+" "+ first);
        System.out.println("Second Occurance of"+" "+ ch +" "+ "is"+" "+ second);
        System.out.println("Third Occurance of"+" "+ ch +" "+ "is"+" "+ third);
    }
}
