package multithreading.synchronizationBlockEx;

public class SynchronizationBlockThreadDemo {

    public static void main(String[] args) {
        Display d=new Display();
        MyThread_Syn t1=new MyThread_Syn(d,"Dhoni");
        MyThread_Syn t2=new MyThread_Syn(d,"Yuvraj");
        t1.start();
        t2.start();
    }
}
