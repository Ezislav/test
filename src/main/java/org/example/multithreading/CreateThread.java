package org.example.multithreading;

public class CreateThread extends Thread {

    //Создание потока
    public static void main(String[] args) {

        //Наследование от класса Thread
        ThreadA threadA = new ThreadA();
        threadA.start();

        //Реализация интерфейса Runnable
        Thread threadB = new Thread(new ThreadB());
        threadB.start();
    }

}
class ThreadA extends Thread {

    @Override
    public void run() {
        System.out.println("ThreadA запущен");
    }
}

class ThreadB implements Runnable {

    @Override
    public void run() {
        System.out.println("ThreadB запущен");
    }

}
