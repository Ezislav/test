package a.c_singletone;

public class Singletone {

    private static Singletone instance;

    // Приватный конструктор предотвращает создание объектов класса извне
    private Singletone() {

    }

    // Метод для получения единственного экземпляра класса
    public synchronized static Singletone getInstanceSingletone() {

        if (instance == null) {
            instance = new Singletone();
        }
        return instance;
    }
}
