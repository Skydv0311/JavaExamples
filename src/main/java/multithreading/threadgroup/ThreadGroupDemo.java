package multithreading.threadgroup;

/**
 * Each thread belongs to some group
 * Each thread group belongs to directly or indirectly to system thread group
 */
public class ThreadGroupDemo {
    public static void main(String[] args) {
        ThreadGroup t=new ThreadGroup("First Group");
        System.out.println(t.getParent().getName());

        System.out.println(Thread.currentThread().getThreadGroup().getName());

        System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());

        System.out.println(t.getParent().getMaxPriority()); //Returns max priority in thread group


    }
}
