package arrayProblems;

public class CountOddEven {
    public static void main(String[] args) {
        int [] a = {5,7,10,12,13,16,18};
        int countOdd = 0;
        int countEven = 0;
/*        for (int i = 1; i < a.length; i++) {
            if (a[i] < (a[i]^1)) {
                countEven++;
            }
            else {
                countOdd++;
            }
        }
 */
        for(int elem:a){
            if(elem<(elem^1)){
                countEven++;
            }
            else{
                countOdd++;
            }
        }
        System.out.println("Even countLeaf: "+ countEven);
        System.out.println("Odd countLeaf: " + countOdd);
    }
}
