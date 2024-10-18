package c_fromInterview_leetCode.leetCode.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class Cycles {

    @Test
    public void forTest() {

        // Стандартный for, используется, когда количество итераций заранее известно

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    @Test
    public void forEach() {

        // Цикл foreach, используется для перебора элементов коллекций и массивов

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        for (Integer e : list) {
            System.out.println(e);
        }

        int[] array = {1, 2, 3, 4, 5, 6, 7};
        for (int e : array) {
            System.out.println(e);
        }
    }


    @Test
    public void whileTest() {

        // Цикл while выполняется, пока условие истинно. Используется, когда количество итераций неизвестно заранее.

        int i = 0;
        while (i <= 20) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    public void doWhileTest() {

        // Цикл do-while выполняет блок кода хотя бы один раз, а затем повторяется, пока условие истинно.

        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i < 20);
    }

    @Test
    public void breakTest() {

        // Оператор break используется для выхода из цикла досрочно.
        // Выйдем из цикла когда i станет 5

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }

    @Test
    public void continueTest() {

        // Оператор continue используется для пропуска оставшейся части текущей итерации и перехода к следующей итерации цикла.
        // Выведем все кроме 5

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
