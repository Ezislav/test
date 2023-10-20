package org.example.multithreading.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorServiceExample {

//    Можем также создать одиночный поток
//    ExecutorService executorService = Executors.newSingleThreadExecutor(1)
    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(1);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new ThreadC());
//            executorService.awaitTermination(3, TimeUnit.SECONDS);
        }
        executorService.shutdown();
    }
}

class ThreadC implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Выполняю свою работу");
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}