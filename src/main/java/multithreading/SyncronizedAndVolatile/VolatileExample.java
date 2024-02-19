package multithreading.SyncronizedAndVolatile;

public class VolatileExample {

//    С volatile переменной:
//
//    volatile гарантирует, что каждый поток будет видеть последнее изменение переменной count.
//    Каждый из 5 потоков выполняет инкремент переменной count 2 раза, при этом после каждого инкремента поток засыпает на 1 секунду (Thread.sleep(1000)).
//    После каждого инкремента текущее значение count выводится в консоль с указанием имени потока.
    public static void main(String[] args) {
        VolatileCounter counter = new VolatileCounter();

        //Создаем 5 потоков и инкрементируем счетчик
        for (int i = 0; i < 10; i++) {
            final int delay = i * 200; // Различная задержка для каждого потока
            new Thread(() -> {
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

//    Thread-0 : 2
//    Thread-4 : 5
//    Thread-3 : 4
//    Thread-1 : 2
//    Thread-2 : 3

//    Thread-0 : 6
//    Thread-1 : 9
//    Thread-3 : 8
//    Thread-4 : 8
//    Thread-2 : 10
}

class VolatileCounter {
    private volatile int count = 0;

    public void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }
}