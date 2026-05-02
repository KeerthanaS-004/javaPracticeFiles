package hashMaps;

import java.util.HashMap;

public class initialise {
    static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
        //adding
        hashMap.put(1, "one");
        hashMap.put(2, "two");
        hashMap.put(3, "three");
        hashMap.put(4, "four");

        System.out.println(hashMap);
//        //updating
//
//        hashMap.put(3, "mooonu");
//        System.out.println(hashMap);
        //deleting
//        hashMap.remove(1);
//        System.out.println(hashMap);
        //traversing
        for(Integer key : hashMap.keySet()) {
            System.out.println(key + " : " + hashMap.get(key));
        }
    }
}
