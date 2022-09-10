package multithreading.concurrentpackageExample;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockEx1 {
    public static void main(String[] args) {
        ReentrantLock l =new ReentrantLock();
        l.lock();
        l.lock();
        System.out.println("Hold count: "+l.getHoldCount()); //output- 2
        System.out.println("Held By CurrentThread: "+l.isHeldByCurrentThread());// output- true
        System.out.println("Queue Length: "+l.getQueueLength()); // output-0
        System.out.println("isLocked: "+l.isLocked());//output - true
        System.out.println("isFair: "+l.isFair()); // output- false
        l.unlock();
        l.unlock();
        System.out.println("Held By CurrentThread: "+l.isHeldByCurrentThread()); // output - false
    }
}
