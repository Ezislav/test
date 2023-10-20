package org.example.multithreading;

public class CreateThread extends Thread {

    //Создание потока
    public static void main(String[] args) {

        //1 способ: Наследование от класса Thread
        ThreadA threadA = new ThreadA();
        threadA.start();

        //2 способ: Реализация интерфейса Runnable
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