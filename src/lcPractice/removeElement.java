//leetcode problem no: 27
//https://leetcode.com/problems/remove-element/
package lcPractice;

import java.util.Arrays;
import java.util.Scanner;

public class removeElement {
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
        System.out.println("Enter the element you want to remove: ");
        int value=sc.nextInt();
        removeElement(arr,value);

    }
    static int removeElement(int[] nums, int val){
        int pos = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[pos]=nums[i];
                pos++;
            }
        }
        System.out.println(pos);
        return pos ;
    }
}
