package a.b_multithreading.CallableAndRunnable;

public class RunnableExample implements Runnable {

//    У него есть один метод: void run().
//    Он не возвращает результат и не может выбросить проверяемое исключение.

    @Override
    public void run() {
        System.out.println("Выполняется поток с помощью Runnable");
    }

    public static void main(String[] args) {
        Thread thread = new Thread(new RunnableExample());
        thread.start();
    }
}