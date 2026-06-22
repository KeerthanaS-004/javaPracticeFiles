package vendorTraining;

public class trapeziumPattern {
    public static void main(String[] args) {
        int n = 4;
        int leftNum = 1;
        int rightNum = n * n + 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("--");
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(leftNum + "*");
                leftNum++;
            }
            for (int j = 0; j < n - i; j++) {
                System.out.print(rightNum + j);
                if (j < n - i - 1) {
                    System.out.print("*"); //to print star
                }
            }
            rightNum = rightNum - (n-i-1);
            System.out.println();
        }
    }
}
