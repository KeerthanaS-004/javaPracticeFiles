package strings;

import java.util.Scanner;

public class swapPairOfCharacters {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str1 = sc.nextLine();
        System.out.println("After swap: "+ swapping(str1));
    }
    /*static String swapping(String str){
        char[] arr1 = str.toCharArray();
        if(arr1.length % 2 == 0){
            for(int i = 0; i < arr1.length; i+=2){
                char temp = arr1[i];
                arr1[i] = arr1[i+1];
                arr1[i+1] = temp;
            }
        }
        else {
            for(int i = 0; i < arr1.length-2; i+=2){
                char temp = arr1[i];
                arr1[i] = arr1[i+1];
                arr1[i+1] = temp;
            }
        }
        return String.valueOf(arr1);
    }*/
    static String swapping(String str1) {
        char [] arr = str1.toCharArray();
        int left = 0;
        int right = 1;
        while (left < arr.length && right < arr.length) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left += 2;
            right += 2;
        }
        return String.valueOf(arr);
    }
}
