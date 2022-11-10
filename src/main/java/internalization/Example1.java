package internalization;

import java.util.Arrays;
import java.util.Locale;

public class Example1 {
    public static void main(String[] args) {
        Locale l1=Locale.getDefault();
        System.out.println(l1.getCountry()+"--------"+l1.getLanguage()); //output:- US----------en
        System.out.println(l1.getDisplayCountry()+"---------------"+l1.getDisplayLanguage()); //output:- United States---------English
        System.out.println("-----------------------------------------------------------");

        Locale l2=new Locale("hi","IN");
        Locale.setDefault(l2);
        System.out.println(Locale.getDefault().getDisplayLanguage()); //output:- Hindi
        System.out.println("------------------------------------------------------------------");
        String s3[]=Locale.getISOLanguages();
        Arrays.asList(s3).forEach(System.out::println);
        System.out.println("----------------------------------------------------------------------");
        String s4[]=Locale.getISOCountries();
        for(String st:s4){
            System.out.println(st);
        }
        System.out.println("-----------------------------------------------------------------------");

        Locale s[]=Locale.getAvailableLocales();
        Arrays.asList(s).forEach(System.out::println);
    }
}
