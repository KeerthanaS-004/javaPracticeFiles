package vendorTraining;
import java.util.*;
public class operationsUsingStream {

    interface A {
        int calculate(int a, int b);
    }
    public static void main(String[] args) {
        operationsUsingStream test = new operationsUsingStream();
        int a = 6;
        int b = 3;

        A add = (x, y) -> x + y;
        A sub = (x, y) -> x - y;
        A mul = (x, y) -> x * y;
        A div = (x, y) -> x / y;
        System.out.println(add.calculate(a, b));
        System.out.println(sub.calculate(a, b));
        System.out.println(mul.calculate(a, b));
        System.out.println(div.calculate(a, b));
/*        test.add(a, b);
        test.sub(a, b);
        test.mul(a, b);
        test.div(a, b);

    }
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }
    public void mul(int a, int b){
        System.out.println(a*b);
    }
    public void div(int a, int b){
        System.out.println(a/b);
    }*/

    }

}
