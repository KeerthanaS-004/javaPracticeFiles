package vendorTraining.Recursion;
import java.util.*;

public class subClassRecursion {
        static void subset(String s, String ans, int index, int size) {
            if (ans.length() == size) {//1==2
                System.out.println(ans);//ab
                return;
            }
            if (index == s.length()) {//1==2
                return;
            }
            // Include current character
            subset(s, ans + s.charAt(index), index + 1, size);

            // Exclude current character
            subset(s, ans, index + 1, size);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a value:");
            String str = sc.nextLine();//ab
            System.out.print("The subsets are:");
            // Print larger subsets first
            for (int i = str.length(); i >= 1; i--) {
                subset(str, "", 0, i);
            }
        }
}
/*
output:
Enter a value:abc
The subsets are:abc
ab
ac
bc
a
b
c

 */