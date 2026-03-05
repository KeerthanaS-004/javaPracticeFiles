package strings;

import java.util.Locale;
import java.util.Scanner;

public class countVowelAndConsonents {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine().toLowerCase();
        count(str);
    }
    static void count(String s) {
        int vowelcount = 0;
        int consonentcount = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowelcount++;
                }
                else{
                    consonentcount++;
                }
            }
        }
        System.out.println("Vowel count: " + vowelcount);
        System.out.println("Consonent count: " + consonentcount);
    }
}
