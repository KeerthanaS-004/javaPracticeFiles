package vendorTraining.DP;
import java.util.*;
public class factorialMemoization {
    static int[] dp = new int[100];
    static int fact(int n) {//1
        if (n == 0 || n == 1) {//1 == 0 // 1 == 1
            return 1;
        }
        if (dp[n] != 0) {//0 != 0
            return dp[n];
        }
        dp[n] = n * fact(n - 1);

        return dp[n];
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//5

        System.out.println(fact(n));
    }
}
