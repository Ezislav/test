package multithreading.Synchronizatori;

//Semaphore

//      Cредство для синхронизации доступа к какому-то ресурсу
//      Управляет ограниченным количеством разрешений.
//      Потоки запрашивают разрешение у семафора, и если разрешение доступно, они захватывают его.

//      Это полезно, например, для ограничения доступа к некоторому ресурсу.

import java.util.concurrent.Semaphore;

public class SemaphorExample {

    public static void main(String[] args) {

        // Cоздаём семафор с 3-мя разрешениями.
        Semaphore semaphore = new Semaphore(3);

        Runnable thread = new Runnable() {
            @Override
            public void run() {

                try {
                    //  Поток пытается получить разрешение. Если доступных разрешений нет, поток блокируется до тех пор, пока разрешение не станет доступным.
                    semaphore.acquire();
                    System.out.println(Thread.currentThread().getName() + " получил разрешение.");

                    //  Затем поток "спит" в течение 2 секунд, симулируя выполнение некоторой работы.
                    Thread.sleep(2000);

                } catch (InterruptedException e) {
                    e.printStackTrace();

                } finally {
                    //  Поток освобождает разрешение (semaphore.release()), чтобы другие потоки могли его получить.
                    System.out.println(Thread.currentThread().getName() + " освободил разрешение.");
                    semaphore.release();
                }
            }
        };

        for (int i = 0; i < 5; i++) {
            new Thread(thread).start();
        }
    }
}