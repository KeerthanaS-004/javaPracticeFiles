package oops;

class create {
    public int add(int a, int b){
        return a + b;
    }
}

public class createObject {
    static void main(String[] args) {
        int num1 = 5;
        int num2 = 5;
        create ans =  new create();
        int result = ans.add(num1, num2);
        System.out.println(result);
    }
}
