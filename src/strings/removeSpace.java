package strings;

import java.util.Scanner;

public class removeSpace {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("The string after removing space is: " + remove(str));

    }
    static String remove(String str) {
//        str = str.replace(" ","");
        return str.replace(" ","");
    }
}
