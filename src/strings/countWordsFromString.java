package strings;

import java.util.Scanner;

public class countWordsFromString {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        countWords(str);
    }
    static void countWords(String str){
        int count = 1;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch ==' '){
                count++;
            }
        }
        System.out.println(count);
    }
}
