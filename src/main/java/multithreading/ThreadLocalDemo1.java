package multithreading;

public class ThreadLocalDemo1 {
    public static void main(String[] args) {
        ThreadLocal tl=new ThreadLocal();
        System.out.println(tl.get()); // output-> null
        tl.set("Shubham");
        System.out.println(tl.get()); //output-> shubham
        tl.remove();
        System.out.println(tl.get()); //output-> null

        /**
         * Overriding of intial method
         */
       ThreadLocal tl1=new ThreadLocal() {
           @Override
           protected Object initialValue() {
               return "abc";
           }
       };

        System.out.println(tl1.get()); // output-> abc
        tl1.set("Shubham");
        System.out.println(tl1.get()); //output-> shubham
        tl1.remove();
        System.out.println(tl1.get()); //output-> abc
    }
}
