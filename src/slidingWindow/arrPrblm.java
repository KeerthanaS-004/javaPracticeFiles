package slidingWindow;

public class arrPrblm {
    public static void main(String[] args) {
        int [] arr = {1, 3, 2, 6, 4};
        int k = 2;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        int max = sum;
        for (int i = k; i < arr.length; i++) {
            sum = sum - arr[i - k] + arr[i];
            if (sum > max) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}
