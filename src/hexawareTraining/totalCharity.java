package hexawareTraining;

import java.util.Scanner;

public class totalCharity {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        int sum = 0;
        for(int i = 1; i <= days; i++){
            sum += i * i;
        }
        System.out.println("Total Charity: "+ sum);
    }
}
