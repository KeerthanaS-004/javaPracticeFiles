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
        System.out.println("in Bb");
    }
    public B(int n){
        this();
//        super(n);
        System.out.println("in Bb int");
    }
}
public class superAndThisKeyword {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}

/*
super(5); Bb() // here the default constructor having super method , refers to the super class's parameterised constructor
this(); --> Bb(int n) //it refers to the class's default constructor, then after excuting super class, it calls itself
Bb obj = new Bb();
output:
in A int
in Bb
 */
/*
super(n); --> Bb(int n)
// inga n pass panra naala , when you create an obj by passing a value, it instfirst calls the super class's parameterised const
Bb obj = new Bb(5);
output:
in A int
in Bb int
 */
/*
super(5) --> Bb()
this() --> Bb(int n)
Bb obj = new Bb(5);
output:
in A int
in Bb
in Bb int
 */