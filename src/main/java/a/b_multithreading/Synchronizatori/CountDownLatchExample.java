package a.b_multithreading.Synchronizatori;

// CountDownLatch (Защелка)
// Позволяет одному или нескольким потокам ожидать, пока другой набор потоков не завершит определенное количество операций.

// Полезно, например, когда вы хотите дождаться завершения инициализации в нескольких потоках, прежде чем продолжить работу в основном потоке.

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {

    public static void main(String[] args) {
        // Создается CountDownLatch c значением счетчика 3. Это означает, что latch будет ждать, пока три потока не вызовут метод countDown.
        CountDownLatch latch = new CountDownLatch(3);

        Runnable thread = new Runnable() {
            @Override
            public void run() {

                try {
                    Thread.sleep(2000);
                    System.out.println(Thread.currentThread().getName() + " завершен.");
                    latch.countDown();

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        // Создаем и запускаем три потока
        for (int i = 0; i < 3; i++) {
            new Thread(thread).start();
        }

        try {
            // Блокирует main поток пока счетчик CountDownLatch не станет равен нулю, пока все три потока не завершат выполнение и не вызовут метод countDown
            latch.await();
            System.out.println(Thread.currentThread().getName() + " Все потоки завершили выполнение!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}