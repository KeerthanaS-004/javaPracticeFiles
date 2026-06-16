package vendorTraining;

import java.util.Random;

public class random {
    public static void main(String[] args) {
        Random r = new Random();
        int n = r.nextInt(1000, 9999);
        System.out.println(n);
    }
}
