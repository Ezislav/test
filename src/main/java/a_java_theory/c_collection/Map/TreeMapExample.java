package a_java_theory.c_collection.Map;

import java.util.TreeMap;

public class TreeMapExample {

//    Сохранение порядка: Естественный порядок ключей или порядок, заданный компаратором.
//    Дубликаты ключей: Не разрешены.
//    Дубликаты значений: Разрешены.
//    Доступ по ключу: Медленнее, чем у HashMap (O(log n) для чтения и записи).
//    Реализация: На основе красно-черного дерева.
//    Преимущества: Упорядоченные ключи, возможность создания подмножеств (subMap).
//    Недостатки: Медленнее по сравнению с HashMap и LinkedHashMap.
    public static void main(String[] args) {

        // Создание TreeMap
        TreeMap<String, String> treeMap = new TreeMap<>();

        // Добавление элементов
        treeMap.put("Ключ 1", "Элемент 1");
        treeMap.put("Ключ 3", "Элемент 3");
        treeMap.put("Ключ 2", "Элемент 2");

        System.out.println(treeMap);

        // Доступ к элементу
        String firstElement = treeMap.get("Ключ 1"); // Получение элемента по ключу "Ключ 1"

        // Изменение элемента
        treeMap.put("Ключ 2", "Измененный Элемент 2"); // Изменение элемента с ключом "Ключ 2"

        // Удаление элемента
        treeMap.remove("Ключ 3"); // Удаление элемента с ключом "Ключ 3"

        // Размер коллекции
        int size = treeMap.size(); // Получение размера коллекции

        // Перебор элементов
        for(String key : treeMap.keySet()) {
            System.out.println("Ключ: " + key + ", Значение: " + treeMap.get(key));
        }

        // Получение первого и последнего ключа
        System.out.println("Первый ключ: " + treeMap.firstKey() + ", Последний ключ: " + treeMap.lastKey());

        // Очистка коллекции
        treeMap.clear();
    }
}
