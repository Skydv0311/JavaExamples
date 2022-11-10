package internalization;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * to display a number in Italy specific form
 */

public class Example2 {
    public static void main(String[] args) {
        double d=123456.789;
        NumberFormat nf=NumberFormat.getInstance(Locale.ITALY);

        System.out.println(nf.format(d));
    }
}
