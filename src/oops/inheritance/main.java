package oops.inheritance;

public class main {
    static void main(String[] args) {
        advCal1 c = new advCal1();
        int n1 = c.add(4,4);
        int n2 = c.sub(6,2);
        int n3 = c.mul(2,3);
        int n4 = c.div(9,3);
        double n5 = c.power(2, 3);
        System.out.println(n1 + " " + n2 + " " + n3 + " " + n4 + " " + n5);
    }
}
