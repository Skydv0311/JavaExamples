package multithreading;

class MyThread_overriding extends Thread{
    @Override
    public void run() {
        System.out.println("Run method");
    }

    /**
     * It will be executed just like a normal method. There will be no multithreading
     */
    @Override
    public synchronized void start() {
        System.out.println("Start Method");
    }
}
public class OverridingStartMethodEx {
    public static void main(String[] args) {
        MyThread_overriding t= new MyThread_overriding();
        /**
         * start() method will call MyThread_overriding class start method just like normal method
         */
        t.start();
    }

}
