package vendorTraining.DP;
import java.util.Scanner;
public class TwoDimensional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();//2

        int[] weight = new int[n];
        int[] value = new int[n];

        System.out.println("Enter weights:");
        for (int i = 0; i < n; i++) {
            weight[i] = sc.nextInt();
        }
        System.out.println("Enter values:");
        for (int i = 0; i < n; i++) {
            value[i] = sc.nextInt();
        }
        System.out.print("Enter capacity: ");
        int W = sc.nextInt();//1

        int[][] dp = new int[n + 1][W + 1];//
    }
}
