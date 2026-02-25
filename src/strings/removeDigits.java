package strings;

import java.util.Scanner;

public class removeDigits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = sc.nextLine();
        System.out.println("After removing digits from string: "+ remove(str));
    }
    static String remove(String s) {
        String newString = "";
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isDigit(ch)){
                i++;
            }
                newString = newString + ch;
        }
        return newString;
    }
}

