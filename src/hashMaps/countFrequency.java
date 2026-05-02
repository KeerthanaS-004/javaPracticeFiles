package hashMaps;

import java.util.HashMap;

public class countFrequency {
    static void main() {
        int[] arr = {1, 2, 1 ,3 ,4 ,2, 5};
        HashMap <Integer, Integer> map = new HashMap<>();
        for(int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        System.out.println(map);
    }
}
