package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class removeDupWithoutExtraArray {
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
        int newSize=arr.length-1;

    }
    static int removeDuplicates(int[] num){
        int pos = 1;
        for(int i = 1; i< num.length; i++){
            if(num[i]!= num[i-1]){
               num[pos]=num[i];
               pos++;
            }
        }
        int  newSize=num[pos];
        return pos;
    }
}
