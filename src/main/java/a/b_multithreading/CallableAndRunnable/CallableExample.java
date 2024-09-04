package a.b_multithreading.CallableAndRunnable;

import java.util.concurrent.*;

public class CallableExample implements Callable<String> {

//    У него есть один метод: V call() (где V - тип возвращаемого значения).
//    Он может возвращать результат или выбросить исключение.

    @Override
    public String call() throws Exception {
        return "Выполняется поток с помощью Callable";
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<String> future = executorService.submit(new CallableExample());

        try {
            System.out.println("start");
            Thread.sleep(3000);
            String result = future.get(); // блокирует, пока задача не будет завершена
            System.out.println(result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        executorService.shutdown();
    }
}
