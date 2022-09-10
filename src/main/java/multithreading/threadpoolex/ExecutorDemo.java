package multithreading.threadpoolex;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

    public static void main(String[] args) {
        PrintJob[] job={
          new PrintJob("Shubham_1"),
          new PrintJob("Shubham_2"),
          new PrintJob("Shubham_3"),
          new PrintJob("Shubham_4"),
          new PrintJob("Shubham_5"),
          new PrintJob("Shubham_6")
        };
        ExecutorService service= Executors.newFixedThreadPool(3);
        for(PrintJob job1: job){
            service.submit(job1);
        }
        service.shutdown();
    }
}
