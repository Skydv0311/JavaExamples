package internalization;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * A program to display current System date in all possible way of US form.
 */

public class Example3 {
    public static void main(String[] args) {
        String fullForm= DateFormat.getDateInstance(0, Locale.US).format(new Date());
        String longForm= DateFormat.getDateInstance(1, Locale.US).format(new Date());
        String mediumForm= DateFormat.getDateInstance(2, Locale.US).format(new Date());
        String shortForm= DateFormat.getDateInstance(3, Locale.US).format(new Date());

        System.out.println("Full Form: "+fullForm);
        System.out.println("Long Form: "+longForm);
        System.out.println("Medium Form: "+mediumForm);
        System.out.println("Short Form: "+shortForm);
    }
}
