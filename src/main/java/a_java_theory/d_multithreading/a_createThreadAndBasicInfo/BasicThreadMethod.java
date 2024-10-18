package a_java_theory.d_multithreading.a_createThreadAndBasicInfo;

public class BasicThreadMethod extends Thread {

    // Создаем новый поток
    static Thread basicThread = new BasicThreadMethod();

    public static void main(String[] args) throws InterruptedException {

        System.out.println(currentThread().getName() + " Начало выполнения программы");
        basicThread.start();
        System.out.println(currentThread().getName() + " Начинаем отчет");

//        Основной поток (не basicThread) засыпает на 4 секунды.
        Thread.sleep(4000);

//        Основной поток прерывает поток basicThread.
        basicThread.interrupt();

        System.out.println(currentThread().getName() + " Конец выполнения программы");

    }

    @Override
    public void run() {
    // Цикл продолжается, пока поток не будет прерван. Метод Thread.interrupted() проверяет, был ли поток прерван, и сбрасывает статус прерывания.
        while (!Thread.interrupted()) {
            try {
                // Выполняем некую логику и засыпаем на секунду
                System.out.println(currentThread().getName() + " Поток выполняет некую логику...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(currentThread().getName() +  " Поток остановлен из-за исключения: " + e.getMessage());

                // Повторная установка статуса прерывания после обработки InterruptedException позволяет корректно управлять прерываниями,
                // сохраняя информацию о том, что поток был прерван
                Thread.currentThread().interrupt();
            }
        }
    }
}