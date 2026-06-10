package arrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the reverse of the array: ");
        int size=sc.nextInt();
        int []  arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array elements");
        System.out.println(Arrays.toString(arr));

        System.out.println("Enter the element to be searched: " );
        int search=sc.nextInt();
        search(arr, search);

    }
    static void search(int[]arr,int x){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("The searched index: "+ i);
                return;
            }
        }
        System.out.print(-1);
    }
}
