package multithreading.deadlockExample;

public class DeadlockDemo extends Thread{
    A a=new A();
    B b=new B();

    public void m1(){
        this.start();
        a.d1(b);
    }

    @Override
    public void run() {
        b.d2(a);
    }

    public static void main(String[] args) {
    DeadlockDemo demo=new DeadlockDemo();
    demo.m1();
    }
}
