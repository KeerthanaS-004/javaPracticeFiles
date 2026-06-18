package vendorTraining.threads;

public class creatingThreadClass extends Thread {
    public void run(){
        int a = 5;
        for(int i = 1; i <= a; i++ ){
            System.out.print(i + " ");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Data Interrupted");
            }
        }
    }
    public void run2(){
        for(char i = 97; i <= 101; i++){
            System.out.print(i + " ");
            try{
                Thread.sleep(2000);
            }
            catch(InterruptedException e){
                System.out.println("Data Interrupted");
            }
        }
    }
    public static void main(String[]args){
        creatingThreadClass m =  new creatingThreadClass();
        Thread t = new Thread(m);
        t.start();
        Thread t1 = new Thread(()->m.run2()); // thread using lamda expression
        t1.start();
     }
}
// output : 1 a 2 b 3 c 4 d e 5 because both threads are in same class