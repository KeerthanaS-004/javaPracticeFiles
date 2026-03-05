package strings;

import java.util.Arrays;
import java.util.Scanner;

public class splitString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str = sc.nextLine();
//        String[] s = str.split("\\d+");
//        String[] s =  str.split(":");
        String[] s =  str.split(":", 2);
//        String[] s = str.split("");
//        String[] arr = str.split("//s");
        System.out.println(Arrays.toString(s));
//        System.out.println(Arrays.toString(arr));
    }
}
