package multithreading.concurrentpackageExample;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread_3 extends Thread {
    static ReentrantLock l = new ReentrantLock();

    MyThread_3(String name) {
        super(name);
    }

    @Override
    public void run() {
        do {
            try {
                if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
                    System.out.println(Thread.currentThread().getName() + " got lock");
                    Thread.sleep(30000);
                    l.unlock();
                    System.out.println(Thread.currentThread().getName() + " release lock");
                    break;
                } else {
                    System.out.println(Thread.currentThread().getName() + " ...unable to get the lock and will try again");
                }
            } catch (InterruptedException e) {
            }
        } while (true);
    }
}
public class LockInterfaceEx4 {

    public static void main(String[] args) {
        MyThread_3 t1=new MyThread_3("Thread 1");
        MyThread_3 t2=new MyThread_3("Thread 2");
        t1.start();
        t2.start();
    }
}

/**
 * similar to below
 * Thread 2 got lock
    * Thread 1 ...unable to get the lock and will try again
    * Thread 1 ...unable to get the lock and will try again
    * Thread 1 ...unable to get the lock and will try again
    * Thread 1 ...unable to get the lock and will try again
    * Thread 1 ...unable to get the lock and will try again
    * Thread 2 release lock
    * Thread 1 got lock
    * Thread 1 release lock
 */