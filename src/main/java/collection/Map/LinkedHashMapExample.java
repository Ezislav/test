package collection.Map;

import java.util.LinkedHashMap;

public class LinkedHashMapExample {

//    Сохранение порядка: Порядок вставки или порядок доступа (если включен режим доступа).
//    Дубликаты ключей: Не разрешены.
//    Дубликаты значений: Разрешены.
//    Доступ по ключу: Быстрый (O(1) для чтения и записи).
//    Реализация: На основе хэш-таблицы с двусвязным списком.
//    Преимущества: Сохранение порядка вставки, быстрый доступ и вставка.
//    Недостатки: Немного выше потребление памяти из-за дополнительной структуры данных.

    public static void main(String[] args) {

        // Создание HashMap
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();

        // Добавление элементов
        linkedHashMap.put("Ключ 1", "Элемент 1");
        linkedHashMap.put("Ключ 2", "Элемент 2");
        linkedHashMap.put("Ключ 3", "Элемент 3");

        System.out.println(linkedHashMap);

        // Доступ к элементу
        String firstElement = linkedHashMap.get("Ключ 1"); // Получение элемента по ключу "Ключ 1"

        // Изменение элемента
        linkedHashMap.put("Ключ 2", "Измененный Элемент 2"); // Изменение элемента с ключом "Ключ 2"

        // Удаление элемента
        linkedHashMap.remove("Ключ 3"); // Удаление элемента с ключом "Ключ 3"

        // Размер коллекции
        int size = linkedHashMap.size(); // Получение размера коллекции

        // Перебор элементов
        for(String key : linkedHashMap.keySet()) {
            System.out.println("Ключ: " + key + ", Значение: " + linkedHashMap.get(key));
        }

        // Очистка коллекции
        linkedHashMap.clear();
    }
}
