package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class reverseAnArrays {
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

//        for (int i = arr.length-1; i >=0 ; i--) {
//           System.out.print(arr[i]+" ");
//        }
        System.out.println("Array after reversing: ");
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void reverse(int [] numb){
        int temp = 0;
        int start = 0;
        int end = numb.length-1;
        for (int i = 0; i < numb.length; i++) {
            if(start<end){
                temp = numb[start];
                numb[start] = numb[end];
                numb[end] = temp;
                start++;
                end--;
            }
        }
    }

}
/*
Enter the reverse of the array:
5
Enter the elements of the array:
1
4
7
8
5
[1, 4, 7, 8, 5]
Array after reversing:
[5, 8, 7, 4, 1]
 */