package oops;

class election{
    public String candidate(String s){
        return s;
    }
    public void age(int n){
        if(n >= 18){
            System.out.println("Age : " + n + " you are eligible");
        }
        else{
            System.out.println("Age : " + n + " you are not eligible");
        }
    }
}
public class methods {
    static void main(String[] args) {
        election e = new election();
        String str = e.candidate("keerthana");
        System.out.println(str);
        e.age(18);
    }
}
