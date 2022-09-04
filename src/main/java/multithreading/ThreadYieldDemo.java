package multithreading;

/**
 * Yield method causes pause to current thread to give chance for waiting thread
 * Not all machines provide support yield support
 */
class MyThread_Yield extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            Thread.yield();
        }
    }
}
public class ThreadYieldDemo {
    public static void main(String[] args) {
        MyThread_Yield t=new MyThread_Yield();
        t.start();
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }
    }
}
