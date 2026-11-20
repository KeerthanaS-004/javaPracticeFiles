package strings;

import java.util.Scanner;

public class InplaceReverseWords {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder();
        String[] arr = s.split(" ");
        for(int i = 0; i < arr.length; i++){
            String curr = arr[i];
            for(int j = curr.length()-1; j >= 0; j--){
                sb.append(curr.charAt(j));
                if(j == 0){
                    sb.append(' ');
                }
            }
        }
        System.out.println(sb);
    }
}
