package a_java_theory.c_collection.List;

import java.util.Stack;

//Расширяет класс Vector и добавляет методы для работы со стеком.
//Работает по принципу LIFO (последний пришел, первый ушел).
//Предоставляет методы push, pop, peek для работы с элементами стека.
public class StackExample {
    public static void main(String[] args) {

        // Создание Stack
        Stack<String> stack = new Stack<>();

        // Добавление элементов (в стек)
        stack.push("Элемент 1");
        stack.push("Элемент 2");

        // Просмотр верхнего элемента стека
        String topElement = stack.peek();

        // Удаление и возврат верхнего элемента стека
        String removedElement = stack.pop();

        // Проверка, пуст ли стек
        boolean isEmpty = stack.isEmpty();

        // Размер Stack
        int size = stack.size();

        // Очистка Stack
        stack.clear();
    }
}