package vendorTraining;

public class dupUsingSIngleLoop {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 1, 7, 1, 1, 2,3}; // 1,
        int c = 0;
        int[] seen = new int[11];
        for(int i= 0; i < a.length; i++) {
            seen[a[i]]++;
            if (seen[a[i]] % 2 == 0) {
                c++;
            }
        }
            System.out.println(c);
    }
}
