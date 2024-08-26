package multithreading.SyncronizedAndVolatile;

public class VolatileExample {

//    Зачем нужен volatile?

//    Гарантия видимости: Ключевое слово volatile гарантирует, что изменения переменной count, сделанные одним потоком, будут видны другим потокам.
//    Обновление переменной в памяти: Без volatile изменения могут быть кэшированы в локальной памяти каждого потока, и другие потоки могут не видеть последних изменений.

//    Использование volatile в этом примере обеспечивает корректное многопоточное взаимодействие с переменной count.

    public static void main(String[] args) {

        VolatileCounter counter = new VolatileCounter();

        //Создаем 5 потоков
        for (int i = 0; i < 5; i++) {

            final int delay = 500;
//            final int delay = i * 500; // Различная задержка для каждого потока

            new Thread(() -> {

                // В цикле будем инкрементировать счетчик 3 раза с задержкой в 1 секунду
                for (int j = 0; j < 3; j++) {

                    counter.increment();
                    System.out.println(Thread.currentThread().getName() + " : " + counter.getCount());

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
}

class VolatileCounter {
    private volatile int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    // Вывод является неравномерным из-за асинхронного выполнения потоков, различной задержки для каждого потока и особенностей планировщика потоков операционной системы.
    // В многопоточных приложениях такое поведение нормально и ожидаемо.

    // Если требуется более упорядоченное выполнение или синхронизация,
    // необходимо использовать дополнительные механизмы, такие как синхронизация (synchronized), блокировки (Lock), или другие примитивы синхронизации.
}

//        Thread-2 : 3
//        Thread-4 : 5
//        Thread-0 : 1
//        Thread-1 : 2
//        Thread-3 : 4

//        Thread-0 : 6
//        Thread-3 : 7
//        Thread-4 : 8
//        Thread-1 : 9
//        Thread-2 : 10

//        Thread-0 : 11
//        Thread-3 : 12
//        Thread-1 : 13
//        Thread-4 : 14
//        Thread-2 : 15