//1480. Running Sum of 1d Array
//https://leetcode.com/problems/running-sum-of-1d-array/description/
package lcPractice;

import java.util.Arrays;
import java.util.Scanner;

public class runningSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the reverse of the array: ");
        int size=sc.nextInt();
        int []  arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Running sum of an array: ");
        sum(arr);
        System.out.println(Arrays.toString(arr));

    }
    static int[] sum(int[] num){
        int sum=0;
        for(int i=1;i<num.length;i++){
            num[i]=num[i-1]+num[i];
        }
        return num ;
    }

}
