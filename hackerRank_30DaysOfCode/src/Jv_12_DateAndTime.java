import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

public class Jv_12_DateAndTime {

    private static String getDay(String day, String month, String year) {

        // by LocalDate
        // LocalDate dt = LocalDate.of(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));
        // return dt.getDayOfWeek().name();

        // by Calendar
        Calendar cDate = Calendar.getInstance();
        cDate.set(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day));

        return cDate.getDisplayName(Calendar.DAY_OF_WEEK, 2, Locale.getDefault()).toUpperCase();

    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        // String month = in.next();
        // String day = in.next();
        // String year = in.next();

        // System.out.println(getDay(day, month, year));
        System.out.println(getDay("5", "7", "2015"));

    }

}
