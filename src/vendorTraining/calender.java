package vendorTraining;
import java.util.Calendar;
import java.util.Formatter;

public class calender {
    /*public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println("The current date is : " + calendar.getTime());
    }*/

    public static void main(String[] args) {

        Formatter f = new Formatter();
        f.format("%3$3s%2$3s%1$3s", "recw", "engineering", "women");
        System.out.println(f);
    }
}
