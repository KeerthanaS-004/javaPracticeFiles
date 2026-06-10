package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class removeDuplicates {
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
        System.out.println("Array without duplicate: ");
        int newSize = remove(arr);
        int [] result = new int [newSize];
        for(int i=0;i<newSize;i++){
            result[i]=arr[i];
        }
        System.out.println(Arrays.toString(result));

    }
    static int remove(int [] nums){
        int pos=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                nums[pos]=nums[i];
                pos++;
            }
        }
        return pos ;
    }
}
