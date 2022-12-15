import java.util.Date;
import java.util.function.*;

interface sum {
    int m1(int a, int b);
}


public class PreDefinedFunctionalInterfaces {

    PreDefinedFunctionalInterfaces(){
        System.out.println("Constructor");
    }

    static void m1(){
        System.out.println("In method");
    }

    public static void main(String[] args) {
        Consumer<String> c = (s) -> System.out.println(s);
        c.accept("Hi There");

        sum s = (a, b) -> a + b;
        System.out.println(s.m1(10,20));

        Predicate<Integer> flag = i -> i % 2 == 0;
        System.out.println(flag.test(10));
        System.out.println(flag.test(9));

        Function<Integer,Integer> multi=a -> a*a;
        BiFunction<Integer,Integer,Integer> add=(a,b)->a+b;

        System.out.println(multi.apply(5));
        System.out.println(add.apply(5,5));

        Supplier<Date> currentDate=()->new Date();

        System.out.println(currentDate.get());

        Runnable r = PreDefinedFunctionalInterfaces::m1;
        r.run();
        Runnable aNew = PreDefinedFunctionalInterfaces::new;
        aNew.run();
    }
}
