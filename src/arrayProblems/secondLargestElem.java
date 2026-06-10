package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class secondLargestElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the reverse of the array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        int len = arr.length;
        Arrays.sort(arr);
        System.out.println("The second elem: "+ arr[len-2]);
    }
}
/*
Enter the reverse of the array:
5
Enter the elements of the array:
1
4
4
5
8
[1, 4, 4, 5, 8]
The second elem: 5
 */