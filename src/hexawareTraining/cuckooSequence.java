package hexawareTraining;

import java.util.Scanner;

public class cuckooSequence {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int prev2 = 0;
        int prev1 = 1;
        for(int i = 1; i <= n; i++){
            int cur = prev1 + 2 * prev2 + 3;
            prev2 = prev1;
            prev1 = cur;
        }
        System.out.println("nth cuckoo term: " + prev1);
    }
}
