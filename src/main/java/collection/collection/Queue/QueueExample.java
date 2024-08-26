package collection.collection.Queue;

import java.util.PriorityQueue;
import java.util.Queue;

//Queue представляет собой коллекцию для хранения элементов в порядке обработки FIFO (первый пришел - первый ушел).
//Она используется для удержания элементов перед их обработкой
public class QueueExample {
    public static void main(String[] args) {
        // Создание Queue (часто используется LinkedList)
        Queue<String> queue = new PriorityQueue<>();

        // Добавление элементов
        queue.offer("Элемент 1"); // Добавляет элемент, возвращает true/false
        queue.add("Элемент 2"); // Добавляет элемент, может выбросить исключение

        // Просмотр головного элемента
        String head = queue.peek(); // Возвращает головной элемент или null, если очередь пуста
        String firstElement = queue.element(); // Возвращает головной элемент, выбрасывает исключение, если очередь пуста

        // Удаление и возврат головного элемента
        String removedElement = queue.poll(); // Удаляет и возвращает головной элемент или возвращает null, если очередь пуста
        String deletedElement = queue.remove(); // Удаляет и возвращает головной элемент, выбрасывает исключение, если очередь пуста

        // Размер Queue
        int size = queue.size();

        // Перебор элементов
        for(String el : queue) {
            System.out.println(el);
        }

        // Очистка Queue
        queue.clear();
    }
}
