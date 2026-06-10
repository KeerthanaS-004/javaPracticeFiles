package lcPractice;

import java.util.Arrays;
import java.util.Scanner;

public class FindtheDuplicateNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the reverse of the array: ");
        int size=sc.nextInt();
        int []  arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("The duplicate number is: "+findDuplicate(arr));

    }
    static int findDuplicate(int[] num) {
        int val = 0;
        for (int i = 1; i < num.length; i++) {
            if (num[i] == num[i - 1]) {
                val = num[i];
            }
        }
        return val;
    }
}
