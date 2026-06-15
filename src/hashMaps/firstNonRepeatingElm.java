package hashMaps;

import java.util.HashMap;

public class firstNonRepeatingElm {
    static void main(String[] args) {
        String st = "thorthelordofthunder";
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(char ch : st.toCharArray()){
            //instfirst countLeaf ah hash map la pottu veikudhu
            hmap.put(ch, hmap.getOrDefault(ch, 0) + 1);
        }
        for(char ch : st.toCharArray()){
            //string la irukkra char hashmap la adhoda countLeaf compare pannudhu
            if(hmap.get(ch) == 1){
                System.out.println("First non duplicate elemnet: " + ch);
                return;
            }
        }
    }
}
