package vendorTraining.Exceptions;


public class Throws {
    static public int div(int a, int b) throws ArithmeticException {
        if(b == 0){
            throw new ArithmeticException("Division by zero");
        }
        return a/b;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
//        int c = div(a, b);
        try {
            div(a, b);
        }
        catch(ArithmeticException e) {
            System.out.println(e);
        }
    }

}
