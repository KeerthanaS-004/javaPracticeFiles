package strings;

import java.util.Scanner;

public class insertIntoString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String original = sc.nextLine();
        System.out.println("String to be added");
        String toAdd = sc.nextLine();
        System.out.println("index");
        int index = sc.nextInt();
        System.out.println("New string after adding: "+ insert(original,toAdd,index));
    }
    static String insert(String origstr, String add, int pos){
        String newString = "";
        for(int i = 0; i< origstr.length(); i++){
            newString += origstr.charAt(i);
            if(i == pos){
                newString += add;
            }
        }
        return newString;
    }
}
