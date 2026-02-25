package strings;

import java.util.Scanner;

public class palindromWithPointers {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s = sc.nextLine();
        if(check(s)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }

    }
    static boolean check(String str){
        int start = 0;
        int end = str.length()-1;
        while (start < end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
