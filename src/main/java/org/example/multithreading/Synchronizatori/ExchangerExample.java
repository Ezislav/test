package org.example.multithreading.Synchronizatori;

import java.util.concurrent.Exchanger;

import static java.lang.Thread.interrupted;

//3. Exchanger (Обменник)
//Описание: Это синхронизатор, который позволяет двум потокам обмениваться данными.
//Другими словами, это точка встречи двух потоков, где они могут обменяться объектами.
//
//Применение: Полезно в сценариях, когда два потока работают вместе и должны обмениваться данными в определенные моменты времени.
public class ExchangerExample {

//1) Создается экземпляр Exchanger, который будет обмениваться строками (Exchanger<String>).
//2) task1 вызывает метод exchange, отправляя строку "Привет от Task1" и ждет, пока другой поток (в данном случае task2) также вызовет exchange.
//3) Аналогично, task2 вызывает метод exchange, отправляя строку "Привет от Task2" и ждет встречи с task1.
//4) Как только оба потока вызывают exchange, происходит обмен данными. То есть task1 получает сообщение от task2, и наоборот.
//5) Сообщения, полученные каждым потоком, выводятся на экран.

    public static void main(String[] args) {
        Exchanger<String> exchanger = new Exchanger<>();

        Runnable task1 = () -> {
            try {
                String messageFromTask2 = exchanger.exchange("Привет от Task1 " + "from " + Thread.currentThread().getName());
                System.out.println("Task1 получил сообщение: " + messageFromTask2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Runnable task2 = () -> {
            try {
                String messageFromTask1 = exchanger.exchange("Привет от Task2 "  + "from " + Thread.currentThread().getName());
                System.out.println("Task2 получил сообщение: " + messageFromTask1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        new Thread(task1).start();
        new Thread(task2).start();
    }
}

