package vendorTraining.Recursion;
import java.util.*;

public class combinations {
    static void combination(int arr[], int index, int target, String ans) {
        if (target == 0) {//4==0
            System.out.println(ans);
            return;
        }
        if (index == arr.length || target < 0) {//0==2 || 4<0
            return;
        }
        // Include current element
        combination(arr, index, target - arr[index], ans + arr[index] + " ");
        // Exclude current element
        combination(arr, index + 1, target, ans);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size: ");
        int n = sc.nextInt();//2

        int arr[] = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        //2 3

        System.out.print("Enter target: ");
        int target = sc.nextInt();//6

        System.out.println("Combinations:");

        combination(arr, 0, target, "");
    }
}
/*
Enter size: 3
Enter elements:
1 2 3
Enter target: 5
Combinations:
1 1 1 1 1
1 1 1 2
1 1 3
1 2 2
2 3
 */