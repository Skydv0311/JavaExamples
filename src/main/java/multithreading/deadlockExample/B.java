package multithreading.deadlockExample;

public class B {

    public synchronized void d2(A a) {
        System.out.println("thread 2 starts execution of d2 method");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {

        }
        System.out.println("Thread 2trying to call A's last mehtod");
        a.last();
    }
        public synchronized void last(){
            System.out.println("Inside B, last() method");
        }
}
