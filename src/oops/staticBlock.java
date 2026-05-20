package oops;
import java.util.*;
class data {
    static String college;
    String name;
    int age;
    long phone;
    public void show(){ //instance method
        System.out.println(name + " : " + age);
        System.out.println("Phone num: " + phone);
    }
    public static  void show1(data obj){
        System.out.println("___This is a static method___");
        System.out.println(college);
        System.out.println(obj.name + " : " + obj.age);
        System.out.println("Phone num: " + obj.phone);
    }
    //constructor
    //see whenever you create an obj the constructor will be called
    public data(){
        college = "KPR";
        System.out.println("___This is constructor___");
    }
    //static block
    //no matter how many objects you create the static block will be called only once
    static{
        System.out.println("___This is a static block___");
    }
}

public class staticBlock {
    static void main(String[] args) throws ClassNotFoundException {
        /*
        data.college = "Hindusthan College";
        data a = new data();
        a.age = 20;
        a.phone = 859985652;
        a.name = "Preethi";
//        a.show();
        data c = new data();
        c.name = "Belly";
        c.age = 22;
        c.phone = 859985652;
//        data.show1(c);
        data d = new data();
        */
        Class.forName("oops.data");
        //loads class even if objects were not created
    }
}

/*
___This is a static block___
___This is constructor___
___This is constructor___
___This is constructor___
*/
