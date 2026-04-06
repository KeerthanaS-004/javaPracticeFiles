package strings;

import java.util.Arrays;

public class reverseWords {
    public static void main(String[] args) {
        String s = "java prog lang";
        reverse(s);
    }
    static void reverse(String s) {
        String[] str = s.split(" ");
        int start = 0;
        int end = str.length - 1;
        while (start < end) {
            String temp = str[start];
            str[start] = str[end];
            str[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(str));
    }
}
