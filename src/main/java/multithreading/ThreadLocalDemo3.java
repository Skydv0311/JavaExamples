package multithreading;

class parentThread extends Thread{

    public static InheritableThreadLocal tl =new InheritableThreadLocal(){
        @Override
        protected Object childValue(Object parentValue) {
            return "CC";
        }};

    @Override
    public void run() {
        tl.set("PP");
        System.out.println("parent thread value--"+tl.get());
        ChildThread ct=new ChildThread();
        ct.start();
    }
}

class ChildThread extends Thread{
    @Override
    public void run() {
        System.out.println("Child Thread value--"+parentThread.tl.get());
    }
}
public class ThreadLocalDemo3 {
    public static void main(String[] args) {
        parentThread pt=new parentThread();
        pt.start();
    }
}
