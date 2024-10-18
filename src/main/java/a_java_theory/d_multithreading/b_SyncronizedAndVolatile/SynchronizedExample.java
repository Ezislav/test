package a_java_theory.d_multithreading.b_SyncronizedAndVolatile;

import java.util.concurrent.atomic.AtomicInteger;

public class SynchronizedExample {

//    synchronized обеспечивает, что только один поток может выполнить метод increment (или любой другой synchronized метод) в данный момент времени.
//    Это обеспечивает корректность и консистентность данных, предотвращая гонки данных.

    public static void main(String[] args) {

        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();

        //Создаем 5 потоков и инкрементируем счетчик
        for (int i = 0; i < 5; i++) {

            // В цикле будем инкрементировать счетчик 3 раза с задержкой
            final int delay = 1000;
//            final int delay = i * 1000; // Различная задержка для каждого потока

            new Thread(() -> {

                for (int j = 0; j < 3; j++) {

                    synchronizedCounter.increment();
                    System.out.println(Thread.currentThread().getName() + " : " + synchronizedCounter.getCount());

                    try {
                        Thread.sleep(delay); // Задержка на 1 секунду
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        System.out.println("Thread was interrupted, Failed to complete operation");
                    }
                }
            }).start();
        }
    }

//    Thread-4 : 5
//    Thread-0 : 1
//    Thread-1 : 2
//    Thread-2 : 3
//    Thread-3 : 4
//    Thread-0 : 8
//    Thread-4 : 9
//    Thread-1 : 8
//    Thread-2 : 8
//    Thread-3 : 10
//    Thread-4 : 12
//    Thread-0 : 12
//    Thread-1 : 14
//    Thread-2 : 13
//    Thread-3 : 15

//    с AtomicInteger
//    Thread-2 : 3
//    Thread-1 : 2
//    Thread-0 : 1
//    Thread-4 : 4
//    Thread-3 : 5
//    Thread-2 : 6
//    Thread-1 : 7
//    Thread-0 : 8
//    Thread-3 : 9
//    Thread-4 : 10
//    Thread-2 : 11
//    Thread-0 : 12
//    Thread-3 : 13
//    Thread-4 : 14
//    Thread-1 : 15
}

class SynchronizedCounter {

//    private int count = 0;

// Использование AtomicInteger гарантирует, что операции инкремента и получения значения будут атомарными и видимыми для всех потоков,
// что исключает возможность появления дублирующихся значений в выводе.
    private final AtomicInteger count = new AtomicInteger(0);

//    Ключевое слово synchronized гарантирует, что только один поток может выполнять этот метод в любой момент времени.
    public synchronized void increment() {
        count.getAndIncrement();
    }

//    Также синхронизирован для обеспечения консистентного доступа к переменной.
    public int getCount() {
        return count.get();
    }
}

//    Синхронизированные методы гарантируют, что только один поток может выполнять инкрементирование или получение значения переменной count в любой момент времени.
//    Это обеспечивает корректность и консистентность данных, предотвращая гонки данных. Однако системное планирование потоков и задержки приводят к тому,
//    что порядок выполнения потоков и, следовательно, порядок вывода значений может быть неравномерным.