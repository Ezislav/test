package a_java_theory.d_multithreading.c_CallableAndRunnableAndFuture;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {

    //Здесь у нас получилось следующее:
    //      1. Создаем executorService с newSingleThreadExecutor: Создается служба выполнения с одним рабочим потоком.
    //      2. Создаем объект Future через executorService.submit(): Задача, которая имитирует длительную операцию с задержкой в 1 секунду, отправляется на выполнение.
    //      3. "Ожидаем завершения задачи..." выводится в консоль.
    //      4. Вызывается метод future.get(): Этот вызов будет блокировать текущий поток (поток, из которого вызван метод), пока асинхронная задача не будет завершена и результат не станет доступным.
    //      5. "Результат: " + result

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(() -> {
            Thread.sleep(3000); // Имитируем какую-то длительную задачу
            return "Done";
        });

        try {
            System.out.println("Ожидаем завершения задачи...");
            String result = future.get();
            System.out.println("Результат: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
    }
}
