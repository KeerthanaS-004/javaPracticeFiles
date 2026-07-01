package vendorTraining;
import java.util.Scanner;

public class printMissingAlps {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int n = sc.nextInt(); // number of characters
            char[] array = new char[n];

            for (int i = 0; i < n; i++) {
                array[i] = sc.next().charAt(0);
            }

            char missing = ' ';

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] + 1 != array[i + 1]) {
                    missing = (char) (array[i] + 1);
                    break;
                }
            }

            System.out.println("The missing character is "+missing);
        }
}
