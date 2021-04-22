package JavaBasic2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentTime {
    public static void main(String[] args) {

        Date currentDate = new Date();
        System.out.println(currentDate);

        SimpleDateFormat timeFormate = new SimpleDateFormat("hh:mm:ss");
        System.out.println(timeFormate.format(currentDate));

        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateFormat.format(currentDate));

        SimpleDateFormat dayOfTheWeek = new SimpleDateFormat("EEEE");
        System.out.println(dayOfTheWeek.format(currentDate));

        SimpleDateFormat clockformate = new SimpleDateFormat("h:mm a");
        System.out.println(clockformate.format(currentDate));
    }
}
