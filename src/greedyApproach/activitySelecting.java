package greedyApproach;
import java.util.*;
public class activitySelecting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] start = new int[n];
        int[] finish = new int[n];
        for (int i = 0; i < n; i++) {//0<3
            System.out.print("Enter start and finish time for activity " + i + ": ");
            start[i] = sc.nextInt();
            finish[i] = sc.nextInt();//3 23 18
        }
        int lastFinish = finish[0];//3
        System.out.println("\nSelected activities:");
        System.out.println("Activity 0 (Start=" + start[0] + ", Finish=" + finish[0] + ")");

        for (int i = 1; i < n; i++) {//3<3
            if (start[i] >= lastFinish) {//13>=23
                System.out.println("Activity " + i + "(Start=" + start[i] + ", Finish=" + finish[i] + ")");
                lastFinish = finish[i];//23
            }
        }
    }
}