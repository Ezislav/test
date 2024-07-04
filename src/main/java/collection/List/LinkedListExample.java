package collection.List;

import java.util.LinkedList;

public class LinkedListExample {

    //Сохранение порядка: Элементы сохраняются в порядке их добавления.
    //Дубликаты: Разрешены.
    public static void main(String[] args) {

        // Создание LinkedList
        LinkedList<String> list = new LinkedList<>();

        // Добавление элементов
        list.add("Элемент 1");
        list.add("Элемент 2");
        list.add("Элемент 3");

        // Добавление элементов в начало и конец списка
        list.addFirst("Начальный элемент");
        list.addLast("Конечный элемент");

        // Доступ к элементу
        String firstElement = list.getFirst(); // Получение первого элемента
        String lastElement = list.getLast(); // Получение последнего элемента

        // Изменение элемента
        list.set(1, "Измененный элемент 2"); // Изменение второго элемента (учитывая, что 0 - это начальный элемент)

        // Удаление элементов
        list.removeFirst(); // Удаление первого элемента
        list.removeLast(); // Удаление последнего элемента
        list.remove(1); // Удаление второго элемента (после удаления первого и последнего)

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
