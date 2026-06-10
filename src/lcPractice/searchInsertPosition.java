//Qn no.: 35 Search Insert Position
//https://leetcode.com/problems/search-insert-position/description/
package lcPractice;

import java.util.Arrays;
import java.util.Scanner;

public class searchInsertPosition {
    public static  void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the reverse of an array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of an array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("The array contains: "+ Arrays.toString(arr));
        System.out.println("Enter the element to be searched: ");
        int tar = sc.nextInt();
        int result = binarySearch(arr, tar);
        System.out.println("The search result is: "+ result);
    }
    static int binarySearch(int [] nums, int target){
        int start = 0;
        int end = nums.length-1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}
/*
Enter the reverse of an array:
5
Enter the elements of an array:
1
3
5
6
8
The array contains: [1, 3, 5, 6, 8]
Enter the element to be searched:
9
The search result is: 5
 */