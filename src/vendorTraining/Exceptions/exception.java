package vendorTraining.Exceptions;

public class exception {
    public static void main(String[] args){
        /*String s = null;
        if(s.length() > 0){
            System.out.println(s);
        }
        checked Exception(complie time)
        */
        int[] a = {1,2,3,4,5,6,7,8,9,10};
        try {
            System.out.println(a[12]);
        }
    /*    catch (Exception e) {
            System.out.println(e); // we should not put this comman exception above the others,
                                      because it already catch the error and threw it ,
                                      so there is no use of any other specified exception
        }*/
        catch(NullPointerException e){
//            System.out.println(e);
            e.printStackTrace();
        }
        catch (Exception e) { // Exception comman librari, last la dha idha call pannanum
            System.out.println(e);
        }
        finally{
            System.out.println("nothinggg");
        }
        System.out.println(a[12]);
        /*System.out.println(a/b); //because of this , the next valid statement is affected and wont printing
        System.out.println(a);*/
    }
}
