package multithreading;

/**
 * Creating thread by extending Thread class
 */

class MyThread extends Thread{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
        }
    }
}

public class ThreadClassEx {

    public static void main(String[] args) {
        /**
         * By Invoking start method
         * Output will be Unexpected
         */

        MyThread thread=new MyThread();
        thread.start();

        /**
         * By Invoking Run method Directly
         * It will work like normal method call
         * Output will be in fixed sequence for all machines
         */

//        thread.run();

        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

    }

}
