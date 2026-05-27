package oops;
class human{
    String name;
    int age;
    String email;
    private int password;
    //create a method to access this private var in other classes
    /*public int getPassword() {
        return password;
    }*/
    //to assign value create a method that accepts the instance variable as args
   /* public void setPassword(int pass) {
        password = pass;
    }*/
    //we can get this getter and setter by default , we dont need to create it by ourself

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
public class privateVariables {
    static void main(String[] args) {
        human obj = new human();
        obj.name = "apple";
        obj.age = 20;
        obj.email = "apple@gmail.com";
        //to access the private variable , use methods for that
        System.out.println(obj.name);
        System.out.println(obj.age);
        System.out.println(obj.email);
        obj.setPassword(48659);
        System.out.println(obj.getPassword());


    }
}
