//125. Valid Palindrome
//https://leetcode.com/problems/valid-palindrome/description/
package lcPractice;

import java.util.Scanner;

public class validPalindrom {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine().toLowerCase();
        boolean palindrome = isPalindrome(str);
        System.out.println(palindrome);
    }
    static boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String str = sb.toString();
        char[] arr = str.toCharArray();
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(arr[start] == arr[end]){
                start++;
                end--;
            }
            else{
                return false;
            }
        }
        return true;
    }

//    static boolean isPalindrome(String s) {
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i < s.length(); i++){
//            char ch = s.charAt(i);
//            if(Character.isLetter(ch) && Character.isDigit(ch)){
//                sb.append(ch);
//            }
//        }
//        int start = 0;
//        int end = sb.length()-1;
//        while(start<end){
//            char chS = sb.charAt(start);
//            char chE = sb.charAt(end);
//            if(chS == chE){
//                return true;
//            }
//            start++;
//            end--;
//        }
//        return false;
//    }
}
