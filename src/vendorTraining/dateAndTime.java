package vendorTraining;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class dateAndTime {
    public static void main(String[] args) {
        Date t = new Date();
        System.out.println(t); // Tue Jun 16 16:32:11 IST 2026
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println(LocalDateTime.now().format(dtf));
    }
}
