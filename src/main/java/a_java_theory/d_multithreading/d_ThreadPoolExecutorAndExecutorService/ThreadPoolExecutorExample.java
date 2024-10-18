package a_java_theory.d_multithreading.d_ThreadPoolExecutorAndExecutorService;

public class ThreadPoolExecutorExample {
    public static void main(String[] args) {

//        // Создание пула потоков с 2 основными потоками и максимум 4 потоками
//        ThreadPoolExecutor executor = new ThreadPoolExecutor(
//                2,          // corePoolSize: минимальное количество потоков в пуле
//                4,                      // maximumPoolSize: максимальное количество потоков в пуле
//                60L,                    // keepAliveTime: время ожидания для избыточных потоков перед завершением
//                TimeUnit.SECONDS,       // единицы измерения для keepAliveTime
//                new LinkedBlockingQueue< Runnable>() // очередь задач
//        );
//
//        // Добавление простых задач в пул
//        for (int i = 0; i < 5; i++) {
//            final int taskNumber = i;
//            executor.execute(() -> {
//                String threadName = Thread.currentThread().getName();
//                System.out.println("Task " + taskNumber + " is running in " + threadName);
//                try {
//                    Thread.sleep(1000); // Имитация выполнения задачи
//                } catch (InterruptedException e) {
//                    Thread.currentThread().interrupt();
//                }
//                System.out.println("Task " + taskNumber + " is finished in " + threadName);
//            });
//        }
//
//        // Инициирование упорядоченного завершения работы
//        executor.shutdown();
//        try {
//            // Ожидание завершения всех задач
//            if (!executor.awaitTermination(60, TimeUnit.SECONDS)) {
//                executor.shutdownNow(); // Принудительное завершение при превышении времени ожидания
//            }
//        } catch (InterruptedException e) {
//            executor.shutdownNow();
//            Thread.currentThread().interrupt();
//        }
//
//        System.out.println("All tasks are finished");
//    }
}
}
