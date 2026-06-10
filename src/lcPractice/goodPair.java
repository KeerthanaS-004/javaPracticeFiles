//1512. Number of Good Pairs
//https://leetcode.com/problems/number-of-good-pairs/description/
package lcPractice;

import java.util.Arrays;
import java.util.Scanner;

public class goodPair {
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
        System.out.println("Count of good pairs: ");
        int pair = numIdenticalPairs(arr);
        System.out.println(pair);
    }
    static int numIdenticalPairs(int[] nums){
        int count=0;
        for(int i=0;i<nums.length;i++){
            for (int j = i+1; j < nums.length ; j++) {
                if(nums[i]==nums[j]){
                    count++;
                }
            }
        }
        return count;
    }
}
