package org.example.virtualThreads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

public class VirtualThreads {

    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello Folksdev");
        };

        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();) {
            executorService.execute(task);
        } catch (Exception e) {
            e.printStackTrace();
        }

        //Örnek 1
        Thread.ofVirtual().start(task);

        //Örnek 2
        var thread = Thread.ofVirtual().unstarted(task);
        thread.start();

        //Örnek 3
        Thread.startVirtualThread(task);


    }
}
