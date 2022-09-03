package multithreading;

class MyThread_overloading extends Thread{
    @Override
    public void run() {
        System.out.println("No arg Run method");
    }

    /**
     * we need to call explicitly like a normal Method call
     */
    public void run(String r){
        System.out.println("Arg run Method");
    }
}
public class OverloadingRunMethodEx {
    public static void main(String[] args) {
        MyThread_overloading t=new MyThread_overloading();
        /**
         * start() method only invokes no arg run() method
         */
        t.start();
    }
}
