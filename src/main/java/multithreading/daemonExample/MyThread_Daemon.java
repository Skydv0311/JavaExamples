package multithreading.daemonExample;

public class MyThread_Daemon extends Thread{
    @Override
    public void run() {
        System.out.println("In child thread");
    }
}
