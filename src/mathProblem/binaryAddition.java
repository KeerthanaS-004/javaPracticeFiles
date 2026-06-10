package strings;

import java.util.Scanner;

public class binaryAddition {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the instfirst binary number:");
        String n1=sc.nextLine();
        System.out.println("Enter the second binary number:");
        String n2=sc.nextLine();
        System.out.println("The final answer is: "+addBinary(n1, n2));

    }
    static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        while(i >= 0 || j >= 0 || carry == 1){
            int sum = carry;
            if(i >= 0){
                sum += a.charAt(i)-'0';
                i--;
            }
            if(j >= 0){
                sum += b.charAt(j)-'0';
                j--;
            }
            sb.append(sum % 2);
            carry = sum / 2;
        }
        return sb.reverse().toString();
    }
}
