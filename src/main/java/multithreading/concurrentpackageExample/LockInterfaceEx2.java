package multithreading.concurrentpackageExample;

public class LockInterfaceEx2 {
    public static void main(String[] args) {
        Display1 d=new Display1();
        MyThread_1 t1=new MyThread_1(d,"Dhoni");
        MyThread_1 t2=new MyThread_1(d,"Yuvraj");
        t1.start();
        t2.start();
    }
}
