package c_fromInterview_leetCode.leetCode.pattern.topkElement;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class findTopkMaxElements {

//      Пирамидальная сортировка (Heap)
//      Идея: Использовать приоритетную очередь (min-heap или max-heap) для хранения K наибольших/наименьших элементов.
//
//      Пример задачи:
//      Найти K наибольших элементов в массиве.

    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 5, 6, 4};
        int k = 2;

        int[] result = findTopkMaxElements(nums, k);
        System.out.println(Arrays.toString(result));  // Output: [2, 1]
    }

    private static int[] findTopkMaxElements(int[] nums, int k) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k, Comparator.reverseOrder()); //Мы создаем приоритетную очередь, которая будет использоваться как минимальная куча (min-heap).

        //Так как мы будем в этой задаче искать максимальные элементы в массиве, нам нужно указать компаратор (обратный порядок).
        //По дефолту PriorityQueue - очередь, в которой лежат значения сначала минимальные и по возрастанию.


        for (int num : nums) {

            if (minHeap.size() < k) {
                minHeap.add(num);     // Заполняем кучу первыми k элементами массива.
            }

//      Обновление кучи после достижения размера k
//      Если размер кучи уже достиг k, мы сравниваем текущий элемент num с наименьшим элементом в куче (minHeap.peek()).

//      Если num больше наименьшего элемента в куче, то:

            else if (num < minHeap.peek()) {
                minHeap.poll();  // Мы удаляем наименьший элемент из кучи с помощью minHeap.poll().
                minHeap.add(num); // Добавляем текущий элемент num в кучу с помощью minHeap.add(num).

            }
        }

//      Заполняем массив result значениями из очереди

        int[] result = new int[k];
        for (int i = 0; i < result.length; i++) {
            result[i] = minHeap.poll();
        }
        return result;
    }
}