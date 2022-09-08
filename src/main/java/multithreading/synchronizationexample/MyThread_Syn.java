package multithreading.synchronizationexample;

public class MyThread_Syn extends Thread{
    Display d;
    String name;
    MyThread_Syn(Display d,String name){
        this.d=d;
        this.name=name;
    }

    @Override
    public void run() {
        d.wish(name);
    }
}
