package c.leetCode.pattern.SlidingWindow;

import java.util.*;

//https://youtube.com/watch?v=P59M5RPi2Ig&list=PLCKD2XyZJi6tlvGZhwCdXsXbZ3h3ZWrCR

//without sorting array
//int size = n
public class findDublicates {

    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; //2, 3
        findUniqueValuesArrayList(nums);
        findUniqueValuesHashSet(nums);
    }

    public static int[] findUniqueValuesArrayList(int[] nums) {

        List<Integer> uniqueElements = new ArrayList<>();
        List<Integer> duplicates = new ArrayList<>();


        for (int element : nums) {

            if (uniqueElements.contains(element)) {

                // Если элемент уже есть в uniqueElements и ещё не добавлен в duplicates, добавляем в duplicates
                if (!duplicates.contains(element)) {
                    duplicates.add(element);
                }
            } else {
                // Если элемент не найден в uniqueElements, добавляем его
                uniqueElements.add(element);
            }
        }

        int[] dublicatesArray = duplicates.stream().mapToInt(s -> s.intValue()).toArray();

        System.out.println(Arrays.toString(dublicatesArray));
        return dublicatesArray;
    }

    public static int[] findUniqueValuesHashSet(int[] nums) {

        // Используем два HashSet: один для уникальных элементов, другой для дубликатов
        Set<Integer> uniqueElements = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int element : nums) {
            if (!uniqueElements.add(element)) {
                // Если элемент не добавляется в uniqueElements, значит, он уже был добавлен ранее, и это дубликат
                duplicates.add(element);
            }
        }

        // Преобразуем Set дубликатов обратно в массив, если нужно
        int[] duplicatesArray = duplicates.stream().mapToInt(Integer::intValue).toArray();

        // Выводим дубликаты
        System.out.println(Arrays.toString(duplicatesArray)); // Output: [1, 2, 3]

        return duplicatesArray;
    }
}