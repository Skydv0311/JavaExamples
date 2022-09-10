package multithreading.concurrentpackageExample;

public class MyThread_1 extends Thread{
    Display1 d;
    String name;

    MyThread_1(Display1 d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
