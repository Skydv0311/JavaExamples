package Practice;

import java.util.concurrent.Executor;

public class ExcecutorDemo {

    public void execute(){
        Executor executor=new Invoker();
        System.out.println(Thread.currentThread().getName());
        executor.execute(()-> System.out.println("---------------------"));
    }
}
