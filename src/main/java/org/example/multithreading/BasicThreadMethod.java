package org.example.multithreading;

public class BasicThreadMethod extends Thread {

    static Thread basicThread = new Thread();

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Начало выполнения программы");
        basicThread.start();
        Thread.sleep(4000);
        basicThread.interrupt();
        System.out.println("Конец выполнения программы");

    }

    @Override
    public void run() {
        while (!Thread.interrupted()) {
            System.out.println("Поток выполняет некую логику...");
        }
        System.out.println("Поток остановлен");
    }
}