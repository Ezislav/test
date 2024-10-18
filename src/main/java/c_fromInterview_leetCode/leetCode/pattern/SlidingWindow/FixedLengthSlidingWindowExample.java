package c_fromInterview_leetCode.leetCode.pattern.SlidingWindow;

public class FixedLengthSlidingWindowExample {

//    Fixed Length Sliding Window

//    Идея: Окно фиксированной длины скользит по массиву или строке.
//    Пример: Поиск подмассива с максимальной суммой фиксированной длины.
//
//    Задача:
//    Найти подмассив фиксированной длины с максимальной суммой.

    public static int maxSumFixedWindow(int[] nums, int k) {
        int maxSum = 0;
        for (int i = 0; i < k; i++) {
            maxSum += nums[i];
        }

        int currentSum = maxSum;
        for (int i = k; i < nums.length; i++) {
            currentSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int k = 3;
        System.out.println(maxSumFixedWindow(nums, k));  // Output: 24 (подмассив [7, 8, 9])
    }

    //Вот объяснение:
    //
    //for (int i = 0; i < k; i++):
    // Этот цикл инициализирует сумму первого окна длины k. Мы берем первые k элементов массива и вычисляем их сумму.

    //for (int i = k; i < nums.length; i++):
    // Этот цикл сдвигает окно длины k по массиву. Мы начинаем с индекса k и двигаемся до конца массива (nums.length). В каждом шаге мы добавляем текущий элемент в сумму окна и вычитаем элемент, который находится за пределами текущего окна, чтобы получить новую сумму окна.

    //Использование nums.length - 1 в этом контексте привело бы к пропуску последнего элемента массива, что неправильно, так как мы хотим рассмотреть все возможные подмассивы длины k в массиве.

//    Приведу немного подробный разбор работы второго цикла:

//    currentSum += nums[i] - nums[i - k];: Мы добавляем новый элемент в окно (тот, что в текущем индексе i) и вычитаем элемент, который выходит из окна (тот, что находится на индексе i - k). Таким образом, сумма окна обновляется за O(1) время.
//    maxSum = Math.max(maxSum, currentSum);: Мы обновляем максимальную сумму, если текущая сумма окна больше, чем ранее найденная максимальная сумма.

}
