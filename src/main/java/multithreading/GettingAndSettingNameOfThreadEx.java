package multithreading;

public class GettingAndSettingNameOfThreadEx {

    public static void main(String[] args) {
        System.out.println("Getting Current Thread Name: "+Thread.currentThread().getName());
        MyThread t=new MyThread();
        System.out.println("Getting MyThread thread Name: "+t.getName());
        Thread.currentThread().setName("My_Main_Thread");
        System.out.println("Getting Current Thread Name After changing the Name: "+Thread.currentThread().getName());
    }
}
