package c_fromInterview_leetCode;

import java.util.ArrayList;
import java.util.Iterator;

// В Java Iterator — это интерфейс, который используется для прохода по элементам коллекции (например, ArrayList, HashSet и т.д.).
// Он позволяет последовательно получать элементы коллекции и удалять их, если это необходимо.


//Зачем нужен Iterator:
//    * Упрощает проход по элементам коллекции.
//    * Предоставляет стандартный способ удаления элементов во время итерации, избегая ConcurrentModificationException.
//    * Позволяет абстрагироваться от конкретной реализации коллекции.

//Использование Iterator делает код более гибким и модульным, так как позволяет работать с различными типами коллекций одинаковым образом.


public class IteratorExample {
    public static void main(String[] args) {

        // Создаем коллекцию ArrayList
        ArrayList<String> list = new ArrayList<>();
        list.add("Element1");
        list.add("Element2");
        list.add("Element3");

        // Получаем итератор для коллекции
        Iterator<String> iterator = list.iterator();

//        // Проходим по элементам коллекции с помощью итератора и выводим их
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }

        // Пробежимся по колллекции итераторм, если элемент будет заканчиваться на "....3", то итератор его удалит
        String e = iterator.next();
        while (e.endsWith("3")) {
            iterator.remove();
        }
        System.out.println(list);
    }
}
