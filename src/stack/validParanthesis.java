package stack;
import java.util.*;
public class validParanthesis {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println(check(s));
    }
    public static boolean check(String s){
        Stack <Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            if(ch == ')' || ch == ']' || ch == '}'){
                if(st.isEmpty()) {
                    return false;
                }
                char c = st.peek();
                if((ch == ')' && c != '(') || (ch == ']' && c != '[') || (ch == '}' && c != '{')){
                    return false;
                }
                else{
                    st.pop();
                }
            }
        }
        if(!st.isEmpty()){
            return false;
        }
        return true;
    }
}
