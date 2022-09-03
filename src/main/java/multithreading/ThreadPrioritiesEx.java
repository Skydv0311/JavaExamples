package multithreading;

public class ThreadPrioritiesEx {

    public static void main(String[] args) {
        System.out.println("Main thread priority: "+Thread.currentThread().getPriority());
        Thread.currentThread().setPriority(7);
        MyThread t=new MyThread();
        System.out.println("child thread priority: "+t.getPriority());
    }
}
