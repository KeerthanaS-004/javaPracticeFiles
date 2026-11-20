package oops;
interface Computer {
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Employee provided with laptop...");
    }
}
class Destop implements Computer{
    public void code(){
        System.out.println("Employee provided with desktop...");
    }
}
class Employee {
    public void developer(Computer use){
        use.code();
    }
}
public class NeedOfInterface {
    public static void main(String[]args){
        Computer lap = new Laptop();
        Computer desk = new Destop();
        Employee Keerthana = new Employee();
        Keerthana.developer(lap);
    }
}
