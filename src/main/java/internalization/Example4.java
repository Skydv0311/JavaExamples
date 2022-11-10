package internalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Display US system date in Date and Time Format
 */
public class Example4 {
    public static void main(String[] args) {
        DateFormat us= DateFormat.getDateTimeInstance(0,0, Locale.US);

        System.out.println("UK style is: "+us.format(new Date()));
    }
}
