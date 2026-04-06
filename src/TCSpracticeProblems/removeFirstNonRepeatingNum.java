package TCSpracticeProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class removeFirstNonRepeatingNum {
    static void main(String[] args) {
//        int[] arr = {9, 4, 9, 6, 7, 4};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(removeNumber(arr));
    }
    static int removeNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    count++;
                }
            }
            if(count == 1) {
                return arr[i];
            }
        }
        return -1;
    }
}
