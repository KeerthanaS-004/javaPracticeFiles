package oops;
class college{
    String name;
    String city;
    public college(){
        name = "Hindusthan";
        city = "Coimbatore";
    }
    public college(String name, String city){ //parametarized constructor
        this.name = name;
        this.city = city;
    }
}
public class constructor{
    static void main(String[] args) {
        college ob1 = new college();
        college ob2 = new college("karpagam", "CBE");
        System.out.println(ob1.name + ":" + ob1.city);
        System.out.println(ob2.name +  ":" + ob2.city);
    }
}
