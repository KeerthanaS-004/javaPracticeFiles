package greedyApproach;
import java.util.*;
public class countCoins {
    public static void main(String[] args) {
        int[] coins = {25, 10, 5, 1};
        Scanner sc = new Scanner(System.in);
        int amount = sc.nextInt();//28
        int count = 0;
        for (int i = 0; i < coins.length; i++) {//4<4
            while (amount >= coins[i]) {//0>=1
                amount -= coins[i];//0
                count++;//4
            }
        }
        System.out.println(count);
    }
}
