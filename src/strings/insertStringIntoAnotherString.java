package strings;

import java.util.Scanner;

public class insertStringIntoAnotherString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string1: ");
        String str1 = sc.nextLine();
        System.out.println("Enter a string2: ");
        String str2 = sc.nextLine();
        System.out.println("Enter the index: ");
        int index = sc.nextInt();
        System.out.println("Final String: ");
//        insert(str1, str2, index);
        System.out.println("New string after adding: "+ insert(str1,str2,index));
    }
    //using substring
    /*static void insert(String  s1,  String s2, int n){
        String ans = s1.substring(0, n+1) + s2 + s1.substring(n);
        System.out.println(ans);
    }*/
    static String insert(String origstr, String add, int pos){
        String newString = "";
        for(int i = 0; i< origstr.length(); i++){
            newString += origstr.charAt(i);
            if(i == pos){
                newString = newString + add + " ";
            }
        }
        return newString;
    }
}
