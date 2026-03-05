package mathProblem;

import java.util.Scanner;

public class hexadecimalToDecimal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter hexadecimal number: ");
        String hexa = sc.nextLine();
        System.out.println("The corresponding decimal number is: ");
        hexaToDecimal(hexa);

    }
    static void hexaToDecimal(String hexadecimal){
        int power = 0;
        int decimal = 0;
        for (int i = hexadecimal.length()-1; i >= 0 ; i--) {
            char ch = hexadecimal.charAt(i);
            int val = ch - 'A' + 10;
            decimal += val * (int)Math.pow(16,power);
            power++;
        }
        System.out.println(decimal);
    }
}
/*
Enter hexadecimal number:
FE
The corresponding decimal number is:
254
*/