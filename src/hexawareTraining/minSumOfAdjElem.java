package hexawareTraining;

import java.util.ArrayList;
import java.util.Scanner;

public class minSumOfAdjElem {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> li = new ArrayList<>();
        for(int i = 0; i < li.size(); i++){
            li.add(sc.nextInt());
        }
        int sum = 0;
        while(li.size() != 0){
            int min = -1;
            int minElem = Integer.MAX_VALUE;
            for(int i = 0; i < li.size(); i++){
                minElem = li.get(i);
                min = i;
            }
            sum += li.get(min);
            li.remove(min);
            if(min < li.size()){
                li.remove(min);
            }
            if(min - 1 >= 0){
                li.remove(min - 1);
            }
        }
        System.out.println("Minimum sum: "+ sum);
    }
}
