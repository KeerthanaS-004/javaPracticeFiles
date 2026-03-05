//344. Reverse String
//https://leetcode.com/problems/reverse-string/description/
package lcPractice;

import java.util.Arrays;
import java.util.Scanner;

public class reverseString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.nextLine();
        char[] arr = str.toCharArray();
//        char [] arr = {'h','e','l','l','o'};
        reverseString(arr);
    }
    static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;
        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(s));
    }
}
