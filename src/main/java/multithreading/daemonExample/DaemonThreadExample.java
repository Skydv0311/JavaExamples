package multithreading.daemonExample;

public class DaemonThreadExample {

    public static void main(String[] args) {
        MyThread_Daemon t=new MyThread_Daemon();
        System.out.println("In main Thread");
        System.out.println("Main thread: "+Thread.currentThread().isDaemon());  //Main thread is always non-daemon thread
        /**
         * If we try to set main thread as daemon thread then we will get IllegalThreadStateException
         * Because we can change non-daemon thread to daemon before starting of a thread but in case of main thread it is started by jvm already
         * Thread.currentThread().setDaemon(true);
         */
        t.setDaemon(true); //we are making child thread as daemon thread
        t.start();
        System.out.println("Child thread: "+t.isDaemon());

    }
}
