package strings;

import java.util.Scanner;

public class removeVowelsFromString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("New string"+" " +removeVowels(s));
    }
    static String removeVowels(String str){
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
