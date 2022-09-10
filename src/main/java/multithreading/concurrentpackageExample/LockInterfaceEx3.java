package multithreading.concurrentpackageExample;

import java.util.concurrent.locks.ReentrantLock;

class MyThread_2 extends Thread{
    static ReentrantLock l=new ReentrantLock();

    MyThread_2(String name){
        super(name);
    }

    @Override
    public void run() {
        if(l.tryLock()){
            System.out.println(Thread.currentThread().getName()+" got lock and performing safe operation");
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){}
            l.unlock();

        }else{
            System.out.println(Thread.currentThread().getName()+" ...unable to get the lock and hence performing alternative operations");
        }
    }
}
public class LockInterfaceEx3 {

    public static void main(String[] args) {
        MyThread_2 t1=new MyThread_2("Thread 1");
        MyThread_2 t2=new MyThread_2("Thread 2");
        t1.start();
        t2.start();
    }
}
