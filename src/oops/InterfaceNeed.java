package oops;

interface Aa{
    void name();
    void  age();
}
class Bb implements Aa{
    public void name(){
        System.out.println("in name");
    }
    public void age(){
        System.out.println("in age");
    }
}
public class InterfaceNeed {
    public static void main(String[]args){
        Aa obj = new Bb();
        obj.name();
        obj.age();
    }
}
