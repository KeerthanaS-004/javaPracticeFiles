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
    public static  void show1(data obj){
        //since we passing the object, we must accept it
        //using this obj reference we can access the non static variables

        System.out.println("___This is a static method___");

        //we can use static variable inside static method
        //but we can not use instance variable inside static method
        //if you want to use other variables use obj reference (see line 12 n 13)
        System.out.println(obj.name + " : " + obj.age);
        System.out.println("Phone num: " + obj.phone);
    }
}
public class staticMethods {
    static void main(String[] args) {
        data.college = "Hindusthan College";
        data a = new data();
        a.age = 20;
        a.phone = 859985652;
        a.name = "Preethi";
        data b = new data();
        b.name = "john";
        b.age = 21;
        b.phone = 859985962;
        a.show();
        b.show();
        data c = new data();
        c.name = "Belly";
        c.age = 22;
        c.phone = 859985652;
        data.show1(c); //static methon is called by class data, it doesnt need object to call
        //by passing the obj itself as an argument
    }
}
