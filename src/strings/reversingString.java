package strings;

import java.util.Scanner;

public class reversingString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        System.out.println("The reversed string is: " + reverse(s));
    }
    static  String reverse(String str){
        String str1="";
        for (int i = str.length()-1; i >= 0; i--) {
            str1=str1+str.charAt(i);
        }
        return str1;
    }
}
