package vendorTraining;
import java.util.*;
public class toyLand {
    public static void main(String[] args) {
       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of house: ");
        int n = sc.nextInt();
        int[] house = new int[n];
        int[] pos =  new int[n];
        System.out.println("Enter the house number : ");
        for(int i=0;i<n;i++){
            house[i] = sc.nextInt();
        }
        System.out.println("Enter the pos number : ");
        for(int i=0;i<n;i++){
            pos[i] = sc.nextInt();
        }*/
        int n = 5;
        int[] house = {3, 1, 2, 5, 4};
        int[] pos = {7, 9, 0, 15, 30};
        for(int i = 0; i < n - 1;  i++) {
            for(int j = 0; j < n - i - 1; j++) {
                if(pos[j] > pos[j + 1]) {
                    int temp = pos[j];
                    pos[j] = pos[j + 1];
                    pos[j + 1] = temp;

                    int tempHouse = house[j];
                    house[j] = house[j + 1];
                    house[j + 1] = tempHouse;
                }
            }
        }
        int maxGap = -1;
        int house1 = -1;
        int house2 = -1;
        for(int i = n - 1; i > 0; i--) {
            int cur = pos[i] - pos[i - 1];
            if(cur > maxGap) {
                maxGap = cur;
                house1 = house[i];
                house2 = house[i - 1];
            }
        }
        if(house1 > house2) {
            System.out.println(house2 + " " + house1);
        }
        else{
            System.out.println(house1 + " " + house2);
        }
    }
}
