package vendorTraining;

import java.util.ArrayList;
import java.util.List;

public class twoDimentionLiist {
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();
        l1.add(1);
        l1.add(2);
        l1.add(3); //[1, 2, 3]
        l2.add(4);
        l2.add(5);
        l2.add(6); //[1, 2, 3]
        l.add(l1);
        l.add(l2);
        System.out.println(l); // [[1, 2, 3], [1, 2, 3]]
      /*  System.out.println(l.get(0).get(0));
        System.out.println(l.get(1).get(0));*/
        for(int i = 0;i<l.size();i++){
            for(int j = 0;j<l.get(i).size();j++){
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }

}
