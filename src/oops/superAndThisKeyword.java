package oops;
class A{
    public A(){
        System.out.println("in A");
    }
    public A(int n){
        System.out.println("in A int");
    }
}
class B extends A{
    public B(){
        super(5);
        System.out.println("in B");
    }
    public B(int n){
        this();
//        super(n);
        System.out.println("in B int");
    }
}
public class superAndThisKeyword {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

/*
super(5); B() // here the default constructor having super method , refers to the super class's parameterised constructor
this(); --> B(int n) //it refers to the class's default constructor, then after excuting super class, it calls itself
B obj = new B();
output:
in A int
in B
 */
/*
super(n); --> B(int n)
// inga n pass panra naala , when you create an obj by passing a value, it instfirst calls the super class's parameterised const
B obj = new B(5);
output:
in A int
in B int
 */
/*
super(5) --> B()
this() --> B(int n)
B obj = new B(5);
output:
in A int
in B
in B int
 */