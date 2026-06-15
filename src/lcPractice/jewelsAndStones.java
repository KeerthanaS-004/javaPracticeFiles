//771. Jewels and Stones
//https://leetcode.com/problems/jewels-and-stones/description/
package lcPractice;

import java.util.Scanner;

public class jewelsAndStones {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the stones string: ");
        String stones = sc.nextLine();
        System.out.println("Enter the jewels string: ");
        String jewels = sc.nextLine();
        System.out.println("The countLeaf: "+" "+numJewelsInStones(jewels, stones));

    }
    static int numJewelsInStones(String jewels, String stones) {
        int sum=0;
        for(int i=0;i<stones.length();i++){
            char ch=stones.charAt(i);
            if(jewels.contains(String.valueOf(ch))){
                sum++;
            }
        }
        return sum;
    }
}
