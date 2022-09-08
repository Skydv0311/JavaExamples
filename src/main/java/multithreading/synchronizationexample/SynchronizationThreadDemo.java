package multithreading.synchronizationexample;

public class SynchronizationThreadDemo {

    public static void main(String[] args) {
        Display d1=new Display();
        Display d2=new Display();
        MyThread_Syn t1=new MyThread_Syn(d1,"Dhoni");
        MyThread_Syn t2=new MyThread_Syn(d2,"Yuvraj");
//        MyThread_Syn t3=new MyThread_Syn(d,"Raina");
//        MyThread_Syn t4=new MyThread_Syn(d,"Kohli");
        t1.start();
        t2.start();
//        t3.start();
//        t4.start();
    }
}
