package multithreading;

/**
 * A thread can interrupt the waiting and sleeping thread by using
 */

class MyThread_Interrupt extends Thread{
    @Override
    public void run() {
        try{
        for(int i=0;i<10;i++){

                System.out.println("I am lazy Thread");
                Thread.sleep(2000);
            }} catch (InterruptedException e) {
                System.out.println("I got interrupted");
            }
        }
    }

public class ThreadIntruptExample {

    public static void main(String[] args) {
        MyThread_Interrupt t=new MyThread_Interrupt();
        t.start();
        t.interrupt();
        System.out.println("End of main");
    }

}
