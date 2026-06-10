package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class countOccuranceOf1s0s {
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
        occuranceOf1s0s(arr);

    }
    static void occuranceOf1s0s(int [] nums){
        int countOfOne = 0;
        int countOfZero = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                countOfOne++;
            }
            else if(nums[i]==0){
                countOfZero++;
            }
        }
        System.out.println("Number of ones in an array: " + countOfOne);
        System.out.println("Number of zeros in an array: " + countOfZero);
    }
}
