package multithreading.ThreadPoolExecutorAndExecutorService;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduledExecutorServiceExample {
    public static void main(String[] args) {

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);

        //Выполнит нашу таску через какой-то delay
        scheduledExecutorService.schedule(new ThreadB(), 2, TimeUnit.SECONDS);
        scheduledExecutorService.shutdown();

        //Будет выполнять нашу таску через определенное время с определенным delay
        //scheduledExecutorService.scheduleAtFixedRate(new ThreadB(), 3, 3, TimeUnit.SECONDS);
    }
}

class ThreadB implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Выполняю свою работу");
//        try {
//            Thread.sleep(4000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
    }
}