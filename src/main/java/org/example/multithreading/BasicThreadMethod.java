package org.example.multithreading;

public class BasicThreadMethod extends Thread {

    static Thread basicThread = new BasicThreadMethod();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Начало выполнения программы");
        basicThread.start();
        System.out.println("Начинаем отчет");
        Thread.sleep(4000);
        basicThread.interrupt();
        System.out.println("Конец выполнения программы");

    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            try {
                System.out.println("Поток выполняет некую логику...");
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Поток остановлен из-за исключения: " + e.getMessage());
                // Повторно прерываем поток, чтобы установить статус прерывания
                Thread.currentThread().interrupt();
            }
        }
    }
}