package strings;

import java.util.Scanner;

public class countOccurance {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        System.out.println("Enter the character");
        char ch = sc.next().charAt(0);
        System.out.println("Number of characters in string: " + countOccu(str, ch));

    }
    static int countOccu(String s, char ch ){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
