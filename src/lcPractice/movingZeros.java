//leetcode problem no. 283
//https://leetcode.com/problems/move-zeroes/

package lcPractice;

import java.util.Arrays;
import java.util.Scanner;

public class movingZeros {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the reverse of the array: ");
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Elements before moving: ");
        System.out.println(Arrays.toString(arr));

        moveZeroes(arr);

        System.out.println("Elements after moving: ");
        System.out.println(Arrays.toString(arr));

    }
    static void moveZeroes(int[] nums) {
        int current = 0;
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[current] != 0) {
                nums[pos] = nums[current];
                pos++;
                current++;
            }
            else{
                current++;
            }
        }
        while(pos < nums.length){
            nums[pos] = 0;
            pos++;
        }
    }
}
