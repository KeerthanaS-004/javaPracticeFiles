package oops;
class name{
    static String college;
    String name;
    int age;
    long phone;
    public void show(){ //instance method
        System.out.println(name + " : " + age);
        System.out.println("Phone num: " + phone);
    }
    public static  void show1(name obj){
        // since we passing the object, we must accept it
        //using this obj reference we can access the not static veriables

        System.out.println("___This is a static method___");

        //we can use static variable inside static method
        //but we can not use instance variable inside static method

        System.out.println(obj.name + " : " + obj.age);
        System.out.println("Phone num: " + obj.phone);
    }
}
public class staticMethods {
    static void main(String[] args) {
        name.college = "Hindusthan College";
        name a = new name();
        a.age = 20;
        a.phone = 859985652;
        a.name = "Preethi";
        name b = new name();
        b.name = "john";
        b.age = 21;
        b.phone = 859985962;
        a.show();
        b.show();
        name c = new name();
        c.name = "Belly";
        c.age = 22;
        c.phone = 859985652;
        name.show1(c); //static methon is called by class name, it doesnt need object to call
        //by passing the obj itself as an argument
    }
}
