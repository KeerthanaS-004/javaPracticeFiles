package hashMaps;

import java.util.HashMap;

public class checkDuplicateExists {
    static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if(map.containsKey(arr[i])){
                System.out.println("duplicate found");
//                System.out.println(sb.append(arr[i]));
                return;
            }
            map.put(arr[i], 1);
        }
        System.out.println("no duplicate found");
    }
}
