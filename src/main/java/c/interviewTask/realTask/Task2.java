package c.interviewTask.realTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Что здесь будет?

// Если не поправить: Exception in thread "main" java.util.ConcurrentModificationException

// При выполнении list.remove(elem) список модифицируется, и итератор больше не может продолжать корректно обходить элементы списка,
// так как его состояние становится некорректным. Это приводит к выбросу исключения ConcurrentModificationException.
public class Task2 {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(Arrays.asList("A", "B", "C", "CA", "BB", "DD"));
        Iterator<String> iter = list.iterator();
        while (iter.hasNext()) {
            String elem = iter.next();
            if (elem.startsWith("B")) {
//                list.remove("B"); // Изначально так, неправильный способ, выбросится ошибка
                iter.remove(); // Правильный способ удаления элемента во время итерации
            }
        }

        System.out.println(list); // [A, C, CA, DD]
    }
}