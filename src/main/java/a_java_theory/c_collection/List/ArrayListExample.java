package a_java_theory.c_collection.List;

import java.util.ArrayList;

public class ArrayListExample {

//    Сохранение порядка: Элементы сохраняются в порядке их добавления.
//    Дубликаты: Разрешены.
    public static void main(String[] args) {

        // Создание ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Добавление элементов
        list.add("Элемент 1");
        list.add("Элемент 2");

        System.out.println(list);

        // Доступ к элементу
        String firstElement = list.get(0); // Получение первого элемента

        // Изменение элемента
        list.set(1, "Измененный элемент 2"); // Изменение второго элемента

        // Удаление элемента
        list.remove(2); // Удаление третьего элемента

        // Размер коллекции
        int size = list.size(); // Получение размера коллекции

        // Перебор элементов
        for(String element : list) {
            System.out.println(element);
        }

        // Очистка коллекции
        list.clear();
    }
}
