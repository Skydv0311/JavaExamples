package multithreading;

class MyThread_IllegalThreadStateExceptionEx extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("In MyThread_IllegalThreadStateExceptionEx run method");
        }
    }
}
public class IllegalThreadStateExceptionEx {
    public static void main(String[] args) {
        MyThread_IllegalThreadStateExceptionEx t=new MyThread_IllegalThreadStateExceptionEx();
        t.start();
        /**
         * After starting a thread if we are trying to start the same thread again then we will get IllegalThreadStateException
         */
        t.start();
    }

}
