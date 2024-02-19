package multithreading.SyncronizedAndVolatile;

public class SynchronizedExample {

//    С synchronized методами:
//
//    synchronized обеспечивает, что только один поток может выполнить метод increment (или любой другой synchronized метод) в данный момент времени.
//    Также создается 5 потоков, и каждый инкрементирует счетчик 2 раза с паузой в 1 секунду между инкрементами.
//    Как и в примере c volatile, текущее значение count и имя потока выводятся в консоль.

    public static void main(String[] args) {
        SynchronizedCounter synchronizedCounter = new SynchronizedCounter();
        //Создаем 10 потоков и инкрементируем счетчик
        for (int i = 0; i < 5; i++) {
            final int delay = i * 1100; // Различная задержка для каждого потока
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

//    Thread-0 : 2
//    Thread-3 : 4
//    Thread-2 : 3
//    Thread-1 : 2
//    Thread-4 : 5

//    Thread-0 : 6
//    Thread-3 : 8
//    Thread-2 : 8
//    Thread-4 : 10
//    Thread-1 : 10
}

class SynchronizedCounter {
    private int count = 0;

    public synchronized void increment() {
        count++;
    }

    public synchronized int getCount() {
        return count;
    }
}