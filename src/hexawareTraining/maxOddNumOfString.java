package hexawareTraining;

import java.util.Scanner;

public class maxOddNumOfString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for(int i = 0; i < n; i++){
            str[i] = sc.next();
        }
        int max = 0;
        int index = -1;
        for(int i = 0; i < n; i++){
            String ss = str[i];
            int s = ss.length();
            if(s % 2 == 1){
                if(s > max){
                    max = s;
                    index = i;
                }
            }
        }
        if(index == -1){
            System.out.println("Better luck next time!!");
        }
        else {
            System.out.println(str[index]);
        }
    }
}
