package vendorTraining.threads;

public class threadapproch2 {

    static class class1 extends Thread{
        public void run(){
            for(int i=1;i<=5;i++){
                System.out.print(i + " ");
                try{
                    Thread.sleep(2000);
                }
                catch(InterruptedException e){
                    System.out.println("Interrupted");
                }
            }
        }
    }
    static class class2 extends Thread{
        public void run(){
            for(char i = 97; i <= 101; i++){
                System.out.print(i + " ");
                try{
                    Thread.sleep(2000);
                }
                catch (InterruptedException e){
                    System.out.println("Interrupted");
                }
            }
        }
    }
    public static void main(String[] args) {
        class1 x = new class1();
        x.run();
        class2 y = new class2();
        y.run();
    }
}
//1 2 3 4 5 a b c d e - because the thread present in seperate class,
// first class one starts then after class 2 oda thread start aagum
