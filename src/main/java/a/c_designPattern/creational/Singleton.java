package a.c_designPattern.creational;

//Этот паттерн гарантирует, что у класса будет только один экземпляр.

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
