package oops;
import java.util.*;
enum Status{
    Running, Pending, Failed, Success;
}
public class EnumClass {
    public static void main(String[]args){
        Status s = Status.Success;
//        System.out.println(s);
//        System.out.println(s.ordinal());
        switch(s){
            case Running:
                System.out.println("Program is running..");
                break;
            case Pending:
                System.out.println("Wait till processing..");
                break;
            case Failed:
                System.out.println("Try again..");
                break;
            default:
                System.out.println("Done..");
        }
    }
}
