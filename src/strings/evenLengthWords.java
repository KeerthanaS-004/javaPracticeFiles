package strings;

import java.util.Scanner;

public class evenLengthWords {
    static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        System.out.println("String with even length: ");
        checkWords(str);
    }
    static void checkWords(String s){
        String [] ss = s.split(" ");
        for (String s2 : ss) {
            if(s2.length()%2==0){
                System.out.println(s2);
            }
        }
    }
}
