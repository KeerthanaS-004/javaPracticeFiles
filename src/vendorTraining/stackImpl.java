package vendorTraining;

import java.util.Stack;

public class stackImpl {
    public static void main(String[] args) {
        int[] a = {6, 4, 1, 3, 7, 4, 3};
        Stack<Integer> st = new Stack<>();
        for (int i  : a) {
            st.push(i);
        }
        System.out.println(st.pop());
    }
}
