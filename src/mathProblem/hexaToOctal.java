/*
package mathProblem;

import java.util.Scanner;

public class hexaToOctal {
    static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
//            System.out.println("Enter hexadecimal number: ");;
            String hexa = sc.nextLine();
//            System.out.println("The corresponding decimal number is: ");
//            hexaTodec(hexa);
            hexaToOctal(hexa);
        }
        static String hexaTodec(String octal){
            int power = 0;
            int decimal = 0;
            for (int i = octal.length()-1; i >= 0 ; i--) {
                char ch = octal.charAt(i);
                int val = ch - 'A' + 10;
                decimal += val * (int)Math.pow(16,power);
                power++;
            }
            System.out.println(decimal);
            return dec
        }
        static void hexaToOctal(String octal){
        int power = 0;
        String decimall = hexaTodec(octal);
            for (int i = decimall.length()-1; i >= 0 ; i--) {
                char c =  octal.charAt(i);
                int vall = c - 'o';
                decimall += vall * (int)Math.pow(8,power);
                power++;
            }
            System.out.println(decimall);
    }
}
*/
