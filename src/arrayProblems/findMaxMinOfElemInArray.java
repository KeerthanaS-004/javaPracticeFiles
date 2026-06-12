package arrayProblems;

public class findMaxMinOfElemInArray {
    public static void main(String[] args) {
        int [] a = {22,35,64,12,78,55};
        int max = a[0];
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if(a[i]>max){
                max=a[i];
            }
            if(a[i]<min){
                min=a[i];
            }
       }
/*        for(int val:a){
            if(val>max){
                max=val;
            }
            if(val<minmax){
                minmax=val;
            }
        }

 */
        System.out.println("largest value: "+ max);
        System.out.println("Minimum value: " + min);
    }
}
