package vendorTraining.Recursion;
import java.util.*;

public class permutation {
        static void permu(int arr[], boolean used[], String ans, int count) {
            if (count == arr.length) {//2==2
                System.out.println(ans);
                return;
            }
            for (int i = 0; i < arr.length; i++)//1<2
            {
                if (used[i] == false) //f=f
                {
                    used[i] = true;
                    //used[0]=t
                    //used[1]=t
                    permu(arr, used,
                            ans + arr[i] + " ",
                            count + 1);
                    used[i] = false; // Backtracking
                }
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter size: ");
            int n = sc.nextInt();//2
            int arr[] = new int[n];
            boolean used[] = new boolean[n];
            System.out.println("Enter elements:");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            //1 2
            System.out.println("Permutations:");
            permu(arr, used, "", 0);
        }
}
