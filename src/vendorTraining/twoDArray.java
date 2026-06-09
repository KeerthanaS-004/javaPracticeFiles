package vendorTraining;
import java.util.*;
public class twoDArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 6;
        int col = 3;
        int[][]seat = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                seat[i][j] = 0;
            }
        }
        while(true){
            System.out.println("what you wish?");
            System.out.println("enter '0' to view seat");
            System.out.println("enter '1' to book seat");
            System.out.println("enter '2' to go back");
            switch(sc.nextInt()){
                case 0:
                    System.out.println(Arrays.deepToString(seat));
                    break;
                case 1:
                    System.out.println("Want to Book?");
                    int r = sc.nextInt();
                    int c = sc.nextInt();
                    if (seat[r][c] == 0) {
                        seat[r][c] = 1;
                        System.out.println("you have booked!");
                        return;
                    }
                    if (seat[r][c] == 1) {
                        System.out.println("The seat is already booked");
                        return;
                    }
                    break;
                case 2:
                    System.out.println("You have exited");
                    return;
                default:
                        System.out.println("Invalid input");
            }

        }

    }
}
       /* seat[0][0] = 1;
        seat[0][1] = 1;
        seat[0][2] = 0;
        seat[1][0] = 1;
        seat[1][1] = 1;
        seat[1][2] = 0;
        seat[2][0] = 1;
        seat[2][1] = 1;
        seat[2][2] = 0;
        seat[3][0] = 1;
        seat[3][1] = 1;
        seat[3][2] = 0;
        seat[4][0] = 1;
        seat[4][1] = 1;
        seat[4][2] = 0;
        seat[5][0] = 1;
        seat[5][1] = 1;
        seat[5][2] = 0;*/