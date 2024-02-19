package collection.List;

import java.util.Vector;

public class VectorExample {

// Vector является синхронизированной версией ArrayList.
// Он обеспечивает динамический массив, который может увеличиваться по мере необходимости.

//    Отличительные особенности:

// Синхронизированный: Vector автоматически синхронизирует доступ к своим методам.
// Наследуется от класса AbstractList и реализует интерфейсы List, RandomAccess.
// Увеличивается в размере вдвое, если достигнут его текущий размер.
    public static void main(String[] args) {
        // Создание Vector
        Vector<String> vector = new Vector<>();

        // Добавление элементов
        vector.add("Элемент 1");
        vector.add("Элемент 2");

        // Доступ к элементу
        String element = vector.get(0);

        // Изменение элемента
        vector.set(0, "Измененный элемент 1");

        // Удаление элемента
        vector.remove(1);

        // Размер Vector
        int size = vector.size();

        // Перебор элементов
        for(String el : vector) {
            System.out.println(el);
        }

        // Очистка Vector
        vector.clear();

    }
}
