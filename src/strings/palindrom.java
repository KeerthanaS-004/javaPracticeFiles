package strings;

import java.util.Scanner;

public class palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String str1 = sc.nextLine();
        String rev=reverse(str1);
        if(str1.equals(rev)){
            System.out.println("palindrom");
        }
        else{
            System.out.println("not palindrom");
        }
    }
    static  String reverse(String str){
        String str1="";
        for (int i = str.length()-1; i >= 0; i--) {
            str1=str1+str.charAt(i);
        }
        return str1;
    }
}
/*
Enter a string
hi
not palindrom
*/