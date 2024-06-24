package collection.Map;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        // Создание HashMap
        HashMap<String, String> map = new HashMap<>();

        // Добавление элементов
        map.put("Ключ 1", "Элемент 1");
        map.put("Ключ 2", "Элемент 2");
        map.put("Ключ 3", "Элемент 3");

        System.out.println(map);

        // Доступ к элементу
        String firstElement = map.get("Ключ 1"); // Получение элемента по ключу "Ключ 1"

        // Изменение элемента
        map.put("Ключ 2", "Измененный Элемент 2"); // Изменение элемента с ключом "Ключ 2"

        // Удаление элемента
        map.remove("Ключ 3"); // Удаление элемента с ключом "Ключ 3"

        // Размер коллекции
        int size = map.size(); // Получение размера коллекции

        // Перебор элементов
        for(String key : map.keySet()) {
            System.out.println("Ключ: " + key + ", Значение: " + map.get(key));
        }

        // Очистка коллекции
        map.clear();
    }
}
