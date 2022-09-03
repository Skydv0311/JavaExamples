package multithreading;

class MyRunnable implements Runnable{

    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("MyRunnable thread");
        }
    }
}
public class MyRunnableEx {
    public static void main(String[] args) {
        MyRunnable r=new MyRunnable();
        Thread t1=new Thread();
        Thread t2=new Thread(r);

        /**
         * case 1
         * A new thread will be created which is responsible for thread class run which has empty implementation
         */
//        t1.start();

        /**
         * case 2
         *No new thread will be created and thread class run will be executed just like a normal method call
         */
//        t1.run();

        /**
         * case 3
         * A new thread will be created which is responsible for the execution of MyRunnable class run() method
         */
        t2.start();

        /**
         * case 4
         * A new thread won't be created and MyRunnable run() method call will be executed just like normal method call
         */
//        t2.run();

        /**
         * case 5\
         * We will get compile time error saying MyRunnable class doesn't have start capability
         */
        //r.start();

        /**
         * case 6
         * MyRunnable class run() method will be executed just like normal method
         */
//        r.run();
    }
}
