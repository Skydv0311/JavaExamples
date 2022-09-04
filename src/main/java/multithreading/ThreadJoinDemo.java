package multithreading;

/**
 * case 1- main thread will wait until completion of child thread
 * If a thread wants to wait until some other thread is completed then we should go for Join Method
 */
class MyThread_Join extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("Child Thread");
            try{
                Thread.sleep(10000);
            }catch (InterruptedException e){

            }
        }
    }
}
public class ThreadJoinDemo {
    public static void main(String[] args) throws InterruptedException {
        MyThread_Join t=new MyThread_Join();
        t.start();
          t.join(10000);
        for(int i=0;i<10;i++){
            System.out.println("Main Thread");
        }

    }
}

/**
 * Case 2 - child thread will wait for completion of main thread
 * To run case 2 - uncomment below code and comment case 1 code
 */

//class MyThread_Join extends Thread{
//    static Thread mt;
//    @Override
//    public void run() {
//        try{
//            mt.join();
//        }catch (InterruptedException e){
//
//        }
//        for(int i=0;i<10;i++){
//            System.out.println("Child Thread");
//        }
//    }
//}
//public class ThreadJoinDemo {
//    public static void main(String[] args) throws InterruptedException {
//        MyThread_Join.mt=Thread.currentThread();
//        MyThread_Join t=new MyThread_Join();
//        t.start();
//        for(int i=0;i<10;i++){
//            System.out.println("Main Thread");
//            Thread.sleep(10000);
//        }
//
//    }
//}


