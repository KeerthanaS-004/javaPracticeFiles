package vendorTraining;

import java.util.*;

public class hashMap {
   /* public static void main(String[] args){
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "hi");
        map.put(2, "hello");
        map.put(2, "world"); //overwrites the old value of 2
        map.put(3, "hello");
        map.put(4, "vanakam");
        System.out.println(map);
        System.out.println(map.keySet() + " ");
        System.out.println(map.values() + " ");
        System.out.println(map.entrySet() + " ");
        System.out.println(map.getOrDefault(5, "nothing")); //gives value associated with that key
        System.out.println(map.putIfAbsent(5, "nothingggg")); //already illa na first print panrapo null print aagum, then it will o and get added there
        System.out.println(map.values() + " ");
        System.out.println(map.keySet() + " ");
    }*/
       public static void main(String[] args) {
           List<Integer> l = Arrays.asList(2, 1, 2, 2, 2, 3, 3, 4, 5, 2); //1-6, 2-4, 3-2, 4-1, 5-1
           Map<Integer, Integer> map = new TreeMap<>(); // 111111 2 2 22 3 3 4 5
           for (Integer i : l) {
               map.merge(i, 1, Integer :: sum);
           }
           System.out.println(map);
       }
}
