package strings;

import java.util.Locale;
import java.util.Scanner;

public class stringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        str1=str1.toUpperCase();
        System.out.println("The string is: " + str1);
    }
}
