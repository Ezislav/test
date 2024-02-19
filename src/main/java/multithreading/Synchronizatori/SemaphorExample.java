package multithreading.Synchronizatori;

//Semaphore (Семафор)
//Описание: Семафор управляет ограниченным количеством разрешений.
//          Потоки запрашивают разрешение у семафора, и если разрешение доступно, они захватывают его.

//Применение: Это полезно, например, для ограничения доступа к некоторому ресурсу.

import java.util.concurrent.Semaphore;

public class SemaphorExample {

    public static void main(String[] args) {

        Semaphore semaphore = new Semaphore(3);

        Runnable task = () -> {
            try {
                semaphore.acquire();
                System.out.println(Thread.currentThread().getName() + " получил разрешение.");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                System.out.println(Thread.currentThread().getName() + " освободил разрешение.");
                semaphore.release();
            }
        };

//        Пример написанный с помощью анонимного класса:
//        Runnable task = new Runnable() {
//            @Override
//            public void run() {
//                try {
//                    semaphore.acquire();
//                    System.out.println(Thread.currentThread().getName() + " получил разрешение.");
//                    Thread.sleep(2000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                } finally {
//                    System.out.println(Thread.currentThread().getName() + " освободил разрешение.");
//                    semaphore.release();
//                }
//            }
//        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }
    }

}
