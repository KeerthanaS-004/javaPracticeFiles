package hexawareTraining;
import java.util.Scanner;
public class angleBlwClockHands {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        double angle = Math.abs((30*h) - (5.5*m));
        if(angle > 180){
            angle = Math.abs(angle - 360);
        }
        System.out.println(angle);
    }
}
// in 3 30 op 75