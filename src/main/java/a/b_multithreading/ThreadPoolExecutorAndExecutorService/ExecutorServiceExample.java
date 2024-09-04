package a.b_multithreading.ThreadPoolExecutorAndExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceExample {

//    Можем также создать одиночный поток
//    ExecutorService executorService = Executors.newSingleThreadExecutor(1)
    public static void main(String[] args) throws InterruptedException {
//        ThreadPoolExecutor executor = new ThreadPoolExecutor();

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

        //Имитация работы потока, что-то сделал, заснул на 2 секунды
        System.out.println(Thread.currentThread().getName() + " Выполняю свою работу");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}