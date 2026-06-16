package vendorTraining;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class dequeue {
    public static void main(String[] args) {
        Deque<String> d = new ArrayDeque<>();
        d.offer("a");
        d.offer("b");
        d.offer("c");
        d.offer("d");
        d.add("e");
        System.out.println(d);
        d.addFirst("01");
        d.addLast("02");
        System.out.println(d);
//        d.pollFirst(); // removes first elem
//        System.out.println(d);
        d.poll(); //also removes the firt elem
        System.out.println(d);
        int i = 0;
        String[] ans = new String[d.size()];
        for (String s : d) {
            ans[i] = s;
            i++;
        }
        for (String s : ans) {
            System.out.println(s + " ");
        }
    }
}
