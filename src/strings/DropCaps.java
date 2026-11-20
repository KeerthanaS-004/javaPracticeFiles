package strings;
import java.util.*;
public class DropCaps {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String [] strArr = str.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr.length; i++) {
            String curr = strArr[i];
            if(curr.length() > 2){
                sb.append(curr.substring(0, 1).toUpperCase()).append(curr.substring(1).toLowerCase());
            }
            else{
                sb.append(curr);
            }
            if(i < strArr.length-1){
                sb.append(' ');
            }
        }
        System.out.println(sb);
    }
}
