package vendorTraining;
import java.util.*;
import java.util.stream.Collectors;

public class stream {
    //method definition
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1, 15, 9, 4, 5);
//        l.forEach(System.out::print); //lambda funciton
        /*
        l.stream() //obj_name.stream()
                .filter(x -> x % 2 == 0) //.operation to perform
                .forEach(System.out::println); //display or conditiom
        */
        /*
        l.stream()
                .map(x -> x * x) //for changing the value
                .sorted()
                .forEach(System.out::println);
         */
       /*
        int temp = l.stream().reduce(0, (a,b)->a+b);
        // 0 --> initial value or starting ,
        // a -> represents total value ,
        // b -> current value that moves forward and get added to the a
        System.out.println(temp);
        */
        List <Integer> result = l.stream()
                .map(x -> x * x)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result);
    }
}
