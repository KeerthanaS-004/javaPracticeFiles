package mathProblem;

import java.util.Scanner;

public class decimalToHexadecimal {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num = sc.nextInt();
        System.out.println("The hexadecimal number is: ");
        System.out.println(convert(num));
    }
    static String convert(int decimal) {
        char [] dec = {'0', '1',  '2', '3', '4', '5', '6', '7', '8','9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder sb = new StringBuilder();
        int rem = decimal % 16;
        char c = dec[rem];
        int quo = decimal / 16;
        if(quo != 0){
            sb.append(quo);
        }
        sb.append(c);
        return sb.toString();
    }
}
