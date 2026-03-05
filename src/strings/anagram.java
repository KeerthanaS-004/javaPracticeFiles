package strings;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {
    static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter a string2: ");
        String str2 = sc.nextLine();
        char [] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(check(arr1,arr2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }
    static boolean check(char [] arr1, char [] arr2){
        if(arr1.length != arr2.length) {
            return false;
        }
        return  Arrays.equals(arr1, arr2);
    }
}
/*
Enter a string1:
listen
Enter a string2:
silent
Anagram
*/