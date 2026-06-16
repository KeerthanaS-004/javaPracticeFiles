package vendorTraining;

import java.util.Set;
import java.util.TreeSet;

public class set {
    public static void main(String[] args) {
        int[] a = {1 , 2, 3, -3, 45, 14, 4};
//        Set<Integer> s = new HashSet<>();
//        Set<Integer> s = new LinkedHashSet<>();
        Set<Integer> s = new TreeSet<>();
        for(int i : a){
            s.add(i);
        }
        System.out.println(s);
    }
}
