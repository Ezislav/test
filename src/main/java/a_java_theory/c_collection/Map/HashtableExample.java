package a_java_theory.c_collection.Map;

import java.util.Hashtable;

public class HashtableExample {

    public static void main(String[] args) {

        // Создание Hashtable
        Hashtable<String, String> table = new Hashtable<>();

        // Добавление элементов
        table.put("Ключ 1", "Элемент 1");
        table.put("Ключ 2", "Элемент 2");
        table.put("Ключ 3", "Элемент 3");

        System.out.println(table);

        // Доступ к элементу
        String firstElement = table.get("Ключ 1"); // Получение элемента по ключу "Ключ 1"

        // Изменение элемента
        table.put("Ключ 2", "Измененный Элемент 2"); // Изменение элемента с ключом "Ключ 2"

        // Удаление элемента
        table.remove("Ключ 3"); // Удаление элемента с ключом "Ключ 3"

        // Размер коллекции
        int size = table.size(); // Получение размера коллекции

        // Перебор элементов
        for(String key : table.keySet()) {
            System.out.println("Ключ: " + key + ", Значение: " + table.get(key));
        }

        // Очистка коллекции
        table.clear();
    }
}