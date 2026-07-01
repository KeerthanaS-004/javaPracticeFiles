package vendorTraining;

import java.util.Arrays;
import java.util.Scanner;

public class printPositionOfAlpa {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
//        char[]ch = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', };
        char[]ch = new char[26];
        int index = 0;
        for(char i = 'a'; i <= 'z'; i++){
            ch[index] += i;
            index++;
        }
//        System.out.println(Arrays.toString(ch));
        String str = sc.nextLine().toLowerCase();
        for(int i = 0; i < str.length(); i++){
            char c = str.charAt(i);
        }
    }
}
