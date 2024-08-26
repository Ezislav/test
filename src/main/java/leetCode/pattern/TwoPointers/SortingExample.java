package leetCode.pattern.TwoPointers;

import java.util.Arrays;

public class SortingExample {

//    Идея: Сначала отсортировать массив или строку, а затем применять алгоритмы для поиска, сравнения и т.д.
//    Пример: Поиск пары чисел, сумма которых равна заданному числу.

//    Задача:
//    Найти два числа в массиве, сумма которых равна заданному значению.

    public static void main(String[] args) {
        int[] nums = {2, 7, 13, 11, 5};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println(Arrays.toString(result));  // Output: [2, 7]
    }

    public static int[] twoSum(int[] nums, int target) {

        Arrays.sort(nums); // {2, 5, 7, 11, 13};

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            int currentSum = nums[left] + nums[right];

            if (currentSum == target) {
                return new int[]{nums[left], nums[right]};
            }
            else if (currentSum < target) {
                left++;
            }
            else {
                right--;
            }
        }
        return new int[0];
    }
}
