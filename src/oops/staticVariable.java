package oops;

class purchase{
    static String type;
    String brand;
    String color;
    public void show(){
        System.out.println(type);
        System.out.println(brand + " : " + color);
    }
}
public class staticVariable {
    static void main(String[] args) {
        purchase.type = "Smart Phone";
        //only declared once
        //always static name can be called with the class name , not with objects
        //here the name "smart phone" is applied to all the objects, because it is static variable
        //The static variable is belongs to the class not the object

        purchase p = new purchase();
        p.brand = "Apple";
        p.color = "White";

        purchase p1 = new purchase();
        p1.brand = "Samsung";
        p1.color = "Purple";

        p.show();
        p1.show();
    }
}
/*
Smart Phone
Apple : White
Smart Phone
Samsung : Purple
*/
