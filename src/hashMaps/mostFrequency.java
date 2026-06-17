package hashMaps;

import java.util.HashMap;

public class mostFrequency {
    static void main(String[] args) {
        int[] nums = {1, 1, 3, 2, 4, 3, 3, 5};
        HashMap<Integer, Integer> hmap = new HashMap<>();
        int max_count = 0;
        int ans = 0;

        for (int num : nums) {
            int count = hmap.getOrDefault(num,0) + 1;
            hmap.put(num, count);

            if(count > max_count){
                max_count = count;
                ans = num;
            }
        }
        System.out.println("The most frequent elem is: " + ans);
    }
}
