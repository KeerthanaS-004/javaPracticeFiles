package vendorTraining.Exceptions;

public class customException {
    static class FunnyException extends Exception {
        public FunnyException(String message) {
            super(message); //calls method of parent class
        }
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        try{
            if(a/b == 1){
                throw new FunnyException("Ok you can divide");
            }
        }
        catch(FunnyException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("finallyyy");
        }
        System.out.println(a/b);
    }
}
