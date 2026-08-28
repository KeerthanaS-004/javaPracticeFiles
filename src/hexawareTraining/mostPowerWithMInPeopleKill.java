package hexawareTraining;

import java.util.Arrays;
import java.util.Scanner;

public class mostPowerWithMInPeopleKill {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] people = {1, 3, 7, 2, 6};
        Arrays.sort(people);
        int demon = 0;
        for(int i = 0; i < people.length; i++){
            demon += people[i];
        }
        int stepen = 0;
        for(int i = people.length-1; i >= 0; i--){
            stepen += people[i];
            demon -= people[i];
            if(stepen > demon){
                break;
            }
        }
        System.out.println("Stepen has max power of: "+ stepen);
    }
}
