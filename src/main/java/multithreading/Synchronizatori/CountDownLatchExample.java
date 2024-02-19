package multithreading.Synchronizatori;

//CountDownLatch (Защелка)
//Описание: Позволяет одному или нескольким потокам ожидать,
//          пока другой набор потоков не завершит определенное количество операций.

//Применение: Полезно, например, когда вы хотите дождаться завершения инициализации в нескольких потоках, прежде чем продолжить работу в основном потоке.

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(3);

        Runnable task = () -> {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " завершен.");
                latch.countDown();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        for (int i = 0; i < 3; i++) {
            new Thread(task).start();
        }

        try {
            latch.await();  // Блокирует текущий поток пока счетчик CountDownLatch не станет равен нулю.
            System.out.println("Все потоки завершили выполнение!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
