package a_java_theory.d_multithreading.a_createThreadAndBasicInfo;

import static java.lang.Thread.currentThread;

public class CreateThread extends Thread {

    //Создание потока
    public static void main(String[] args) {

        //1 способ: Наследование от класса Thread
        ThreadA threadA = new ThreadA();
        threadA.start(); // Запускает новый поток, который выполнит метод run()

        //2 способ: Реализация интерфейса Runnable
        Thread threadB = new Thread(new ThreadB());
        threadB.start(); // Запускает новый поток, который выполнит метод run()
//        threadB.run(); // Запускает метод run() в текущем потоке
    }

//    Зачем нужен метод run()?
//
//    Метод run() содержит основную логику работы потока.
//    Вы переопределяете метод run(), чтобы определить, что именно должен делать поток, когда он запускается.
//    Метод run() выполняется, когда поток начинает свою работу, т.е., когда вызывается метод start().

//    Если вы напрямую вызовете метод run() вместо метода start(), то код в методе run() будет выполнен в текущем потоке, а не в новом.
//    Для правильной многопоточности всегда следует использовать метод start(), который в свою очередь вызывает метод run() в контексте нового потока.

}

class ThreadA extends Thread {

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " ThreadA запущен");
    }
}

class ThreadB implements Runnable {

    @Override
    public void run() {
        System.out.println(currentThread().getName() + " ThreadB запущен");
    }
}