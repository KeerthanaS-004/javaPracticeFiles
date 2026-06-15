package vendorTraining;

import java.util.*;

public class arrayList {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(1);
        l.add(2);
        l.add(3);
        System.out.println(l); // get(index)
        boolean flag= l.contains(4);
        if(flag) {
            System.out.println("we already have the value");
        }
        else {
            l.add(4);
        }
        System.out.println(l);
        System.out.println(l.size());
        List<Integer> l1 = Arrays.asList(0, -1, 55, 20, 10); //l1 ah static ah creat panrom
        System.out.println(l1);
        l.addAll(l1); // we cant add l to l1 because it is statically created, l is dynamic
        System.out.println(l);
        Collections.sort(l);
        System.out.println(l);
        Collections.reverse(l);
        System.out.println(l);
    }
}
