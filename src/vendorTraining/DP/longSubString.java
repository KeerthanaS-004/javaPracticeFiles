package vendorTraining.DP;

import java.util.Scanner;

public class longSubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s1 = sc.next();//ABC
        String s2 = sc.next();//BCD

        int n = s1.length();//3
        int m = s2.length();//3

        int[][] dp = new int[n + 1][m + 1];

        int max = 0;
        int end = 0;

        for (int i = 1; i <= n; i++) {//4 <= 3
            for (int j = 1; j <= m; j++) {//4 <= 3
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {//C == D
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > max) {//1>1
                        max = dp[i][j];//1
                        end = i;//2
                    }
                }
            }
        }
        System.out.println("The longest substring is "+s1.substring(end - max, end));
    }
}
